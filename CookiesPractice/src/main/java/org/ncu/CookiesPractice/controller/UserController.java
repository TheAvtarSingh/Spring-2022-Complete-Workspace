package org.ncu.CookiesPractice.controller;

import java.util.Iterator;

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
/* Normal Way
@RequestMapping("/mail")
public String mailme(HttpServletRequest request, @ModelAttribute("user") User user,Model m) {
	Cookie[] cookies = request.getCookies();
	for(Cookie temp:cookies) {
		if (temp.getName().equals("name")) {
			String myCookie = temp.getValue();
			user.setUserName(myCookie);
			m.addAttribute("name",myCookie);
		}
	}
	return "EmailMe";
}
*/


@RequestMapping("/mail")
public String mailme(@CookieValue("name")String cookieValue, @ModelAttribute("user") User user,Model m) {
    user.setUserName(cookieValue);
	m.addAttribute("name",cookieValue);
	return "EmailMe";
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
