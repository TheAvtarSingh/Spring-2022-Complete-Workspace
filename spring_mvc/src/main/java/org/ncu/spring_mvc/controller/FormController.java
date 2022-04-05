package org.ncu.spring_mvc.controller;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping("/form")
@Controller
public class FormController {
	
	@RequestMapping("/inputForm")
public String inputForm() {
	return "input-form";
}
	
	
/*
 * @RequestMapping("/processForm") public String processme(HttpServletRequest
 * request,Model model) { String name = request.getParameter("userName"); name =
 * name.toUpperCase(); String roll = request.getParameter("userRoll"); roll =
 * "20csu"+roll; model.addAttribute("newname", name);
 * model.addAttribute("newroll", roll); return "process-form"; }
 */ 
	
	@RequestMapping("/processForm")
//	Manuplating Data using Spring Controller
public String processme(@RequestParam("userName")String name,@RequestParam("userPass")String pass,Model model,@RequestParam("gender") String gender,@RequestParam("instruction") String inst) {
	String errorString = "Field is empty!!";
		if (name.isEmpty() || pass.isEmpty()) {
			errorString = errorString.toUpperCase();
			model.addAttribute("error",errorString);
			
		}else {
			errorString = name;
		errorString = errorString.toUpperCase();
			model.addAttribute("error",errorString);
		}
		
		if (gender.equals("male")) {
			gender = "Mr." + name;
			gender = gender.toUpperCase();
			model.addAttribute("gender",gender);
		}else {
			gender = "Mrs." + name;
			gender = gender.toUpperCase();
			model.addAttribute("gender",gender);
		}
		inst= inst.toUpperCase();
		model.addAttribute("inst",inst);
	return "process-form";
}
	
	
}
