package com.hackathon.restapi.restservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hackathon.restapi.restservices.service.UserService;

@Controller
public class UserController {
	
	//private String UserId;
	//private String Password;
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService){
		//this.UserId = userId;
		//this.Password = password;
		this.userService = userService;
	}
	
	@RequestMapping("/login")
	public String UserLogin(Model model){
		model.addAttribute("loginresp", userService.updateUser("abc", "xyz"));
		return "home";
	}
}
