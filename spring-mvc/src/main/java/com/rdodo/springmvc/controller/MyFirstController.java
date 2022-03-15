package com.rdodo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyFirstController {

	
	@GetMapping(value = "/first")
	public String firstView() {
		System.out.println("Executing this method.");
		return "firstview";
	}
}
