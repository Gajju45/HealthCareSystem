package com.health.care.system.service;

import java.util.List;


import com.health.care.system.dto.User;

public interface UserService {
	
	Boolean addUser(User user);
	Boolean deleteUser(Integer userId);
	User getUserById(Integer userId);
	User updateUser(User user);
	public List<User> getUserList();

}
