package org.ncu.SessionManagementPractice.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response,HttpServletRequest request,Model M) throws IOException{
		//Random Session Id
		Random random = new Random();
		
		//Making range
		int randNo = random.nextInt(1000);
		
		String value = Integer.toString(randNo);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("mySession", value);
		String sessionValue = (String)session.getAttribute("mySession");
		M.addAttribute("UserID", sessionValue);
		
		return new ModelAndView("home");
	}
}
