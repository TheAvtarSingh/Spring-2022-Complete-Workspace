package org.ncu.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/UserControl")
public class UserController {
	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	
	@RequestMapping("/display")
public String showform() {
	return "display-form";
}
@RequestMapping("/process")
public String processform(@ModelAttribute("user")User user) {
	System.out.println("Username : "+user.getName());
	System.out.println("Password : "+user.getPassword());
	System.out.println("Roll No : "+user.getRollNo());
	return "confirmation";
}
}
