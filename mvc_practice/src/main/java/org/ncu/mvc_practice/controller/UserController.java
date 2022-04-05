package org.ncu.mvc_practice.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/UserController")
public class UserController {
@ModelAttribute("user")
public User fetchedData() {
	return new User();
}

@RequestMapping("/display")
public String showinputform() {
	return "input-form";
}
	
@RequestMapping("/process")
public String processedForm(@Valid @ModelAttribute("user")User user,BindingResult result,Model M,HttpServletResponse response) {
	Cookie namecookie = new Cookie("name", user.getUserName());
	namecookie.setMaxAge(60);
	response.addCookie(namecookie);
	
	Cookie passwordcookie = new Cookie("pass", user.getPass());
	passwordcookie.setMaxAge(100);
	response.addCookie(passwordcookie);
	System.out.println("Name : "+user.getUserName());
	System.out.println("Password : "+user.getPass());
	System.out.println("Gender : "+user.getGender());
	 if(result.hasErrors()) {
         return "input-form";
     }else {
    	 M.addAttribute("message", "Successfully saved phone: "
    	          +user.toString());
    		return "process-form";
	}
}
}
