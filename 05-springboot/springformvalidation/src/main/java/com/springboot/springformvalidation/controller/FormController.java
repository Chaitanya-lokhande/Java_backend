package com.springboot.springformvalidation.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.springformvalidation.entities.LoginDetails;

import jakarta.validation.Valid;

@Controller
public class FormController {

	@RequestMapping("/open-form")
	public String openForm(Model model) {
		model.addAttribute("loginDetails", new LoginDetails());
		return "form";
	}
	
	@PostMapping("/process")
	public String formSubmitHandler(@Valid @ModelAttribute("loginDetails") LoginDetails loginDetails, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "form";
		}
		System.out.println(result);
		System.out.println(loginDetails);
		return "success";
	}
}
