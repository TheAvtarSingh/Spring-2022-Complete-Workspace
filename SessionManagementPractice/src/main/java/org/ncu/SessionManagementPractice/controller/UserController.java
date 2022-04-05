package org.ncu.SessionManagementPractice.controller;

import java.util.Iterator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@RequestMapping("/UserController")
@SessionAttributes("UserID")
public class UserController {
@ModelAttribute("user")
public User fetchedData() {
	return new User();
}
/* Normal Way */
/*
@RequestMapping("/mail")
public String mailme(HttpSession session,HttpServletRequest request, @ModelAttribute("user") User user,Model m) {
	String sessionValue = (String)session.getAttribute("mySession");
	m.addAttribute("UserID", sessionValue);
	session.invalidate();
	return "EmailMe";
}
*/

@RequestMapping("/mail")
public String mailme(@ModelAttribute("user") User user,Model m,@SessionAttribute("UserID")String name) {

	  
	  m.addAttribute("UserID", name);
	return "EmailMe";
}


@RequestMapping("/display")
public String showinputform(HttpSession session,Model M) {
	String sessionValue = (String)session.getAttribute("mySession");
	M.addAttribute("UserID", sessionValue);
	System.out.println(sessionValue);
	return "input-form";
}

	
@RequestMapping("/process")
public String processedForm(@Valid @ModelAttribute("user")User user,BindingResult result,Model M,HttpServletResponse response,HttpSession session) {
	String sessionValue = (String)session.getAttribute("mySession");
	M.addAttribute("UserID", sessionValue);
	System.out.println("Name : "+user.getUserName());
	System.out.println("Password : "+user.getPass());
	System.out.println("Gender : "+user.getGender());
	M.addAttribute("name",user.getUserName());
	 if(result.hasErrors()) {
         return "input-form";
     }else {
    	 M.addAttribute("message", "Successfully saved phone: "
    	          +user.toString());
    		return "process-form";
	}
}



}
