package com.demo.pal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.pal.model.UserModel;

@Controller
@RequestMapping("/user")
public class SignInController {

	
	
	
	@PostMapping("/addUser")
	public String addUser(@RequestParam("uname11") String username, @RequestParam("email11") String userEmail, @RequestParam("psw11") String userPassword,
			@RequestParam("psw-repeat11") String passCheck, @RequestParam("mob1") Long mobNo) {
		
		RestTemplate restTemplate= new RestTemplate(); 
		System.out.println("hello got the user");
		System.out.println(username);
		System.out.println(userEmail);
		System.out.println(userPassword);
		System.out.println(passCheck);
		System.out.println(mobNo);
		
		
		
		return "welcome";
	}
	
	@PostMapping("/hello")
	public String user() {
		System.out.println("Hi, this is the user");
		return "welcome";
	}
	
}
