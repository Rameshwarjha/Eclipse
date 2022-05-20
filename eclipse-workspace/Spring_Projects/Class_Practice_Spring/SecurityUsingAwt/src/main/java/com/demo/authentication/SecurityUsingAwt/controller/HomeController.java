package com.demo.authentication.SecurityUsingAwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.authentication.SecurityUsingAwt.entity.User;
import com.demo.authentication.SecurityUsingAwt.repo.UserRepository;

@RestController
public class HomeController {

	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
		
	}
	
	@GetMapping("/user")
	public List<User> getUser(){
		return userRepo.findAll();
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userRepo.save(user);
		
	}
	
	@RequestMapping("/login")
	public String loginpage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutpage() {
		return "logout.jsp";
	}
	
}
