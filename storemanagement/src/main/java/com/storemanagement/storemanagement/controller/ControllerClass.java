package com.storemanagement.storemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	
	@RequestMapping("/")
	public String login() {
		return "EmployeRegistration";
		
	}
	
	

}
