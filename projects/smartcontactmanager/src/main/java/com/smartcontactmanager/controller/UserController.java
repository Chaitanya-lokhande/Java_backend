package com.smartcontactmanager.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartcontactmanager.dao.UserRepository;
import com.smartcontactmanager.entities.ContactInfo;
import com.smartcontactmanager.entities.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@ModelAttribute
	public void addCommonData(Model model, Principal principal) {
		String username = principal.getName();
		User user = userRepository.getUserByUserName(username);
		System.out.println(user);
		model.addAttribute("user", user);
	}
	
	@GetMapping("/dashboard")
	public String userDashboard(Model model, Principal principal) {
		model.addAttribute("title", "My Dashboard");
		
		return "user/dashboard";
		
	}
	
	@GetMapping("/add-contact")
	public String addContactHandler(Model model) {
		model.addAttribute("title", "Add Contact");
		model.addAttribute("contact", new ContactInfo());
		return "user/add-contact-form";
	}
}
