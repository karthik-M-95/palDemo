package com.demo.pal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {

	// for user login
	@GetMapping(value="/Login")
	public String Login() {
		
		return "preFiles/loginpage";
	}
	
	@GetMapping(value="/signin2")
	public String SignIn() {
		
		return "preFiles/signInpage";
	}
	
	// for user home
	@GetMapping(value="/home")
	public String home() {
		return "preFiles/home";
	}
	
// for logout
	@GetMapping(value="/logout")
	public String logout() {
		SecurityContextHolder.getContext().setAuthentication(null);
		return "preFiles/home";
	}
	
	// for Invalid Session
	@GetMapping(value="/InvalidSession")
	public String InvalidSession() {
		
		return "InvalidSession";
	}


	//login default
	@GetMapping(value="/Home")
	public String defaultLoginSuccess() {	
		return "logInFiles/suc124";
	}
	
	//loginsuccessurl
	@GetMapping(value="/LoginUser")
	public String postLoginSuccess(@RequestParam("uname") String uname, @RequestParam("password") String password) {
		System.out.println("we r in LoginUser");
		return "preFiles/fp";
	}

	
	// for access denied
	@GetMapping(value="/accessDenied")
	public String AccessDenied() {	
		return "accessDenied";
	}
	
	// for forgot password
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
