package com.springthymeleaf.practice.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

	@RequestMapping("/homepage")
	public String homepage(Model model) {
		model.addAttribute("name", "Chaitanya");
		return "homepage";
	}
	
	
	@RequestMapping("/iterations")
	public String iterateHandler(Model model) {
		List<String> names = List.of("Chaitanya", "Sakshi", "Sahil", "Ganesh");
		model.addAttribute("names", names);
		return "iteration";
	}
	
	@RequestMapping("/about")
	public String aboutHandler(Model model) {
		
		return "about";
	}
	
}
