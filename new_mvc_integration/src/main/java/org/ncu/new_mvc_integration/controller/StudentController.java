package org.ncu.new_mvc_integration.controller;

import java.util.List;

import org.ncu.new_mvc_integration.dao.Studentdao;
import org.ncu.new_mvc_integration.dao.Studentdaoimpl;
import org.ncu.new_mvc_integration.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/Controller")
public class StudentController {
	
//	Studentdao studentdao = new Studentdaoimpl();
	@Autowired
	private  Studentdao studentdao;
	
@GetMapping("/showStudent")
public String showStudentList(Model model) {
	List<Student> Studentlist = studentdao.getStudents();
	model.addAttribute("students",Studentlist);
	return "student-list";
}


}
