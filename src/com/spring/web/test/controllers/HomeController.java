package com.spring.web.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.web.test.dao.Offer;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String showHome(){
		
		return "home";
	}
}
