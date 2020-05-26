package com.demo.pal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {

	
	@GetMapping(value="/Login")
	public String Login() {
		return "login";
	}

	@GetMapping(value="/logout")
	public String logout() {
		SecurityContextHolder.getContext().setAuthentication(null);
		return "login";
	}
	
	@GetMapping(value="/InvalidSession")
	public String InvalidSession() {
		
		return "InvalidSession";
	}

	
	@GetMapping(value="/loginError")
	@ResponseBody
	public ResponseEntity<String> LoginError() {
		return new ResponseEntity<String>("login.jsp", HttpStatus.BAD_REQUEST);		
	}
	
	@GetMapping(value="/signup")
	public String SignIn() {
		
		return "signIn";
	}
	
	
	@GetMapping(value="/defsuc")
	public String defaultLoginSuccess() {	
		return "suc124";
	}
	
	@GetMapping(value="/LoginUser")
	public String postLoginSuccess(@RequestParam("uname") String uname, @RequestParam("password") String password) {
		System.out.println("we r in LoginUser");
		return "fp";
	}
	
	@GetMapping(value="/accessDenied")
	public String AccessDenied() {	
		return "accessDenied";
	}
	
	
	@GetMapping(value="/forgotPassword")
	public String ResetPass() {
		System.out.println("Password change");
		return "pass435";
	}
	
	 
	 
	 
//    @RequestMapping(value = "/postLogin", method = RequestMethod.POST)
//    public String postLogin(Model model, HttpSession session) {
//        log.info("postLogin()");
//        // read principal out of security context and set it to session
//        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
//        validatePrinciple(authentication.getPrincipal());
//        User loggedInUser = ((PdfUserDetails) authentication.getPrincipal()).getUserDetails();
//        model.addAttribute("currentUser", loggedInUser.getUsername());
//        session.setAttribute("userId", loggedInUser.getId());
//        return "redirect:/wallPage";
//    }
	
}
