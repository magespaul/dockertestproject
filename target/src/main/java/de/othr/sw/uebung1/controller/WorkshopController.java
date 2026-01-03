package de.othr.sw.uebung1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkshopController {
	@GetMapping("/workshop/add")
	public String add() {
		return "workshop/add";
	}
	
	@GetMapping("/workshop/edit")
	public String edit() {
		return "workshop/edit";
	}
	
	@GetMapping("/workshop/find")
	public String find() {
		return "workshop/find";
	}
}
