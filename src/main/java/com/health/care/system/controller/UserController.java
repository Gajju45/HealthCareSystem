package com.health.care.system.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health.care.system.dto.User;
import com.health.care.system.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("user")
	private String addUser(@RequestBody User user)
	{
		this.userService.addUser(user);
		return "Successfully added";
	}
	
	@GetMapping("user/{userId}")
	private User getUserById(@PathVariable Integer userId)
	{
	return this.userService.getUserById(userId)	;
	}
	
	@GetMapping("users")
	private List<User> getUsers() {
		
		return this.userService.getUserList();
	}
	@PatchMapping("user")
	private String updateUser(@RequestBody User user)
	{
		this.userService.updateUser(user);
		return "update Successfully";
	}

}
