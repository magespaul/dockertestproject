package de.othr.sw.uebung1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
	@GetMapping("/form")
	public String show() {
		return "form";
	}
	
	@GetMapping("/processform")
	public String process() {
		return "formprocessed";
	}
}
