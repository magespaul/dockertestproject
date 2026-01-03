package de.othr.sw.uebung1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	@GetMapping("/student/add")
	public String add() {
		return "student/add";
	}
	
	@GetMapping("/student/edit")
	public String edit() {
		return "student/edit";
	}
	
	@GetMapping("/student/find")
	public String find() {
		return "student/find";
	}
}
