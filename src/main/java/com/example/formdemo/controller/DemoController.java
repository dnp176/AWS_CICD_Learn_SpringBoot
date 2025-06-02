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
		return "<h1 style='color:yellow'>Home Screen</h1>";
	}
	
	@RequestMapping("/demo")
	public String demoRequeString(){
		System.out.println("demoRequeString screen...");
		return "<h1 style='color:blue'>Demo Controller ... !!!</h1>";
	}
	
	@RequestMapping("/test1")
	public String test1(){
		System.out.println("testing1111 screen...");
		return "<h1 style='color:Chartreuse'>testing1111 Screen ... !!!</h1>";
	}
	
	@RequestMapping("/test2")
	public String test2(){
		System.out.println("testing2222 screen...");
		return "<h1 style='color:Chocolate'>testing22222 Screen ... !!!</h1>";
	}
	
	@RequestMapping("/test3")
	public String test3(){
		System.out.println("testing3333 screen...");
		return "<h1 style='color:DarkOrange'>testing33333 Screen ... !!!</h1>";
	}

	@RequestMapping("/test4")
	public String test4(){
		System.out.println("testing4444 screen...");
		return "<h1 style='color:red'>NEw Updated 1.0.1</h1>";
	}

	@RequestMapping("/test5")
	public String test5(){
		System.out.println("testing55555 screen...");
		return "<h1 style='color:red'>NEw Updated 2.0.1</h1>";
	}
}
