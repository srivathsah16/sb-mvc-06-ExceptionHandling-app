package com.srivath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String greet(Model model) {
		System.out.println(10/0);
		model.addAttribute("msg", "Greetings...");
		return "index";
	}
}
