package com.smartcontactmanager.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartcontactmanager.dao.UserRepository;
import com.smartcontactmanager.entities.ContactAddress;
import com.smartcontactmanager.entities.ContactInfo;
import com.smartcontactmanager.entities.User;
import com.smartcontactmanager.helper.Message;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	List<String> stateList = List.of("Maharashtra", "California", "Texas", "New York", "Delhi");

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

	@RequestMapping("/add-contact")
	public String addContactHandler(Model model) {
		model.addAttribute("title", "Add Contact");
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setContactAddress(new ContactAddress());
		model.addAttribute("contactInfo", contactInfo);
		model.addAttribute("stateList", stateList);
		return "user/add-contact-form";
	}

	@PostMapping ("/do-add-contact")
	public String doAddContactHandler(@Valid @ModelAttribute("contactInfo") ContactInfo contactInfo, BindingResult validationResult, @RequestParam (value = "profileImage") String profileImage, Principal principal, HttpSession session, Model model){
		try{
			if(profileImage==null){
				contactInfo.setProfileImage("default.png");
			}
			if(validationResult.hasErrors()){
				System.out.println("ERROR: " + validationResult.toString());
				model.addAttribute("contactInfo", contactInfo);
				throw new Exception("Please fill correct data");
			}
			String name = principal.getName();
			User user = this.userRepository.getUserByUserName(name);
			contactInfo.setUser(user);
			user.getListOfContacts().add(contactInfo);
			this.userRepository.save(user);
			System.out.println(contactInfo);
			model.addAttribute("stateList", stateList);
			session.setAttribute("message", new Message("Contact Created Successfully!", "alert-success"));
		 
		} catch(Exception e){
			e.printStackTrace();
			model.addAttribute("contactInfo", contactInfo);
			model.addAttribute("stateList", stateList);
			session.setAttribute("message", new Message(e.getMessage(), "alert-danger"));
			return "user/add-contact-form";
		}

		return "user/add-contact-form";
	}

}
