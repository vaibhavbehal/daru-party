package com.example.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.docker.entuty.User;
import com.example.docker.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public User put(User user) {
		  User u=new User();
		  u.setName("harry");
		  u.setAge(20);
		  
		  this.userRepo.save(u);
		  return u;  
		  
	}
	
	public List<User>all(){
		return this.userRepo.findAll();
	}
}
