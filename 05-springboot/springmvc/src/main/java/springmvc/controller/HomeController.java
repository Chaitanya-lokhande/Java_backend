package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String homePage(Model model) {
		System.out.println("This is home url..");
		model.addAttribute("name", "Sai Lokhande");
		return "index";
	}
	
	@RequestMapping("/about")
	public String aboutPage() {
		System.out.println("This is about page from Controller...");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView helpPage() {
		System.out.println("This is help page from Controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Sai Lokhande");
		modelAndView.setViewName("/help");
		
		return modelAndView;
	}
	
	public String 

}
