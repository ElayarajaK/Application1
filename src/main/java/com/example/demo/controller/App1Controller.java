package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {
	/*@GetMapping
	@PostMapping
	@PutMapping
	@DeleteMapping*/
	
	
	@GetMapping(value = "/")
	public String printHomeData() {
		return "<h1> <i> This is Main Page <i></h1>";
	}
	@RequestMapping("/Admin")
	public String printData() {
		return "<h1> <i> This is Admin Page <i></h1>";
	}
	
	@RequestMapping("/User")
	public String printUserData() {
		return "<h1> <i> This is User Page <i></h1>";
	}

}
