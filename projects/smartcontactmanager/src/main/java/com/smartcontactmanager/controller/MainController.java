package com.smartcontactmanager.controller;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartcontactmanager.dao.UserRepository;
import com.smartcontactmanager.entities.User;
import com.smartcontactmanager.helper.Message;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	
	private final BCryptPasswordEncoder passwordEncoder;
	
	private final UserRepository userRepository;

	MainController(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@GetMapping("/")
	public String homePageHandler(Model model) {
		model.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}
	
	@GetMapping("/signup")
	public String signUpHandler(Model model) {
		model.addAttribute("title", "Signup - Smart Contact Manager");
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@PostMapping("/do-register")
	public String userRegisterHandler(@Valid @ModelAttribute("user") User user, BindingResult validationResult, @RequestParam(value="agreement", defaultValue="false") boolean agreement, Model model, HttpSession session ) {
		try {
			if(!agreement) {
				System.out.println("Terms and condition not agreed");
				throw new Exception("Please read and agree terms and conditions");
				
			}
			if(validationResult.hasErrors()) {
				
				System.out.println("ERROR: " + validationResult.toString());
				model.addAttribute("user", user);
				throw new Exception("Please fill correct data");
				
			}
			user.setRole("ROLE_USER");
			user.setEnabled(true);
			user.setImageUrl("default.png");
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			
			User resultUser = this.userRepository.save(user);
			System.out.println(resultUser);
			model.addAttribute("user", new User());
			session.setAttribute("message", new Message("User registered successfully!! Please Login!", "alert-success"));
		}
		catch(DataIntegrityViolationException dup){
			dup.printStackTrace();
			model.addAttribute("user", user);
			session.setAttribute("message", new Message("User already exists. Please Login!", "alert-danger"));
			return "signup";
		}
		catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("user", user);
			session.setAttribute("message", new Message(e.getMessage(), "alert-danger"));
			return "signup";
		}
		
		return "signup";
	}
	
	@GetMapping("/login")
	public String loginPageHandler(Model model) {
		model.addAttribute("title", "Login - Smart Contact Manager");
		return "login";
	}
}
