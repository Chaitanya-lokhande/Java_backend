package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.UserDetails;
import springmvc.service.UserService;

@Controller
public class ContactFormController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	//Using @RequestParam annotation
	/*@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleform(@RequestParam(name="userName", required=true) String userName, 
			@RequestParam(name="userEmail", required=true) String userEmail, 
			@RequestParam(name="userPassword", required=true) String passsword, Model model) {
		System.out.println("User Name is: " + userName);
		System.out.println("User Email is: " + userEmail);
		System.out.println("User Password is: " + passsword);
		model.addAttribute("name", userName);
		
		
		return "processform";
	}*/
	
	
	//Using ModelAttribute
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleform(@ModelAttribute UserDetails userDetails, Model model) {
		System.out.println(userDetails);
		this.userService.CreateUser(userDetails);
		//model.addAttribute("user", userDetails);	
		return "processform";
	}
}
