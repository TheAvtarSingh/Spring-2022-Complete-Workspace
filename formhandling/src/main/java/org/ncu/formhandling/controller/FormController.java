package org.ncu.formhandling.controller;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//@RequestMapping("/form")
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
public String processme(@RequestParam("userName")String name,@RequestParam("userRoll")String roll,Model model) {
		name = name.toUpperCase();
		roll = "20csu"+roll;
		model.addAttribute("newname", name);
		model.addAttribute("newroll", roll);
	return "process-form";
}
	
	
}
