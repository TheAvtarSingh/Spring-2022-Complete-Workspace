package org.ncu.SessionManagementPractice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/PrintController")
//@SessionAttributes("UserID")
public class PrintController {
	@ModelAttribute("user")
	public User fetchedData() {
		return new User();
	}
	//Note : HttpSession is available here but @SessionAttribute is only Avaliable in Taken @SessionAttributes Controller i.e. UserConroller Only
@RequestMapping("/print")	
public String printdetails(Model M,HttpSession session) {
	String sessionValue = (String)session.getAttribute("mySession");
	M.addAttribute("UserID", sessionValue);
	return "print";
	
}

/* Will Not Work Here
@RequestMapping("/print")
	
public String printdetails(Model M,@SessionAttribute("UserID") String name) {
	String sessionValue = (String)session.getAttribute("mySession");
	M.addAttribute("UserID", sessionValue);
	return "print";
	
}
*/

	
}
