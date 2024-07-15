package com.srivath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/")
	public String getWelcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome to Spring Web MVC");
		return "index";
	}
	
	@GetMapping("/hello")
	public String getHelloMsg(Model model) {
		String string = null;
		System.out.println(string.length());
		model.addAttribute("msg", "Hello from MVC");
		return "index";
	}
}
