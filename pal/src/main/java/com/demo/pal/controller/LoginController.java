package com.demo.pal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	
	@GetMapping(value="/Login")
	public String Login() {
		
	
		return "welcome";
	}
	
	
	@PostMapping(value="/LoginUser")
	public String LoginUser(@RequestParam("uname") String userName, @RequestParam("psw") String password) {
		
		System.out.println("hello");
		System.out.println(userName + password);
		return "fp";
	}
	
	@GetMapping(value="/signup")
	public String Signup() {
		
		
		return "signIn";
	}
	
	@GetMapping(value="/forgotPassword")
	public String ResetPass() {
		
		System.out.println("Password change");
		return "pass435";
	}
	
}
