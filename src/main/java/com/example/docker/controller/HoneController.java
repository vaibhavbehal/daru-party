package com.example.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.entuty.User;
import com.example.docker.service.UserService;

@RestController
public class HoneController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String method(User user) {
		User u= userService.put(user);
		return "added";  
	}
	
	@GetMapping("/getall")
	public List<User>alll(){
		return userService.all();  
	}
	
	@GetMapping("nice")
	public String method() {
//		User u= userService.put(user);
		return "nice";   
	}
	

	
	
}
