package com.demo.pal.controller;

import java.util.Date;

import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.demo.pal.model.UserModel;

@Controller
@RequestMapping("/user")
public class SignInController {

	@ResponseBody
	@PostMapping(value= "/addUser1")
	public  ResponseEntity<String> addUser1(@RequestBody UserModel user , Session session ){
		
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("Baeldung-Example-Header", 
	      "Value-ResponseEntityBuilderWithHttpHeaders");
	 
	    System.out.println("Session "+ session.getSession()+ session);
		
		System.out.println("Hello got the user Object");
		System.out.println(user);
		System.out.println(user.getUserName());
		System.out.println(user.getUserEmail());
		System.out.println(user.getUserPassCheck());
		System.out.println(user.getUserPassword());
		System.out.println(user.getMobileNo());
		System.out.println(user.getDateOfBirth()); 
		
		if(user.getUserName().equals("karthik")) {
			 return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.OK);
			}else {
			return new ResponseEntity<String>("Hello World", HttpStatus.NOT_ACCEPTABLE);
		
		}
//		return ResponseEntity.ok();             ResponseEntity<String>

	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestParam("uname11") String username, @RequestParam("email11") String userEmail, @RequestParam("psw11") String userPassword,
			@RequestParam("psw-repeat11") String passCheck,@RequestParam("dob") String userdob, @RequestParam("mob1") Long mobNo) {
		
		RestTemplate restTemplate= new RestTemplate(); 
		System.out.println("hello got the user");
		System.out.println(username);
		System.out.println(userEmail);
		System.out.println(userPassword);
		System.out.println(passCheck);
		System.out.println(userdob);
		System.out.println(mobNo);
		
		
		
		return "welcome";
	}
	
	@PostMapping("/addNewUser")
	public ResponseEntity<String> newUser(@RequestBody UserModel user) {
		
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("Baeldung-Example-Header", "Value-ResponseEntityBuilderWithHttpHeaders");
		
		System.out.println("Hello new user object");
		System.out.println(user);
		System.out.println(user.getUserName());
		System.out.println(user.getUserEmail());
		System.out.println(user.getUserPassCheck());
		System.out.println(user.getUserPassword());
		System.out.println(user.getMobileNo());
		System.out.println(user.getDateOfBirth()); 
		if(user.getUserName().equals("karthik")) {
			 return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.OK);
			}else {
			return new ResponseEntity<String>("Hello World", HttpStatus.NOT_ACCEPTABLE);
		
		}
		
	}
	
}
