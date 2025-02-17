package com.example.formdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home screen...");
		return "<h1 style='color:red'>Home Screen</h1>";
	}
	
	@RequestMapping("/demo")
	public String demoRequeString(){
		System.out.println("demoRequeString screen...");
		return "<h1 style='color:blue'>Demo Controller ... !!!</h1>";
	}
}
