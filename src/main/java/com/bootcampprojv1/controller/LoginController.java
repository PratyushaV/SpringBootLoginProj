package com.bootcampprojv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcampprojv1.model.LoginDetails;
import com.bootcampprojv1.service.LoginDetailsService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginDetailsService loginDetailsService;

	@RequestMapping( value="/verifyLogin",  method=RequestMethod.POST)
	public LoginDetails verifyLoginFromDatabase( @RequestParam String LoginId, @RequestParam String Password) {
		
		return loginDetailsService.verifyLogin(LoginId, Password);
	}
	
	@RequestMapping("/login")
	public String ShowLoginForm(){
		return "login";
	}
	}
