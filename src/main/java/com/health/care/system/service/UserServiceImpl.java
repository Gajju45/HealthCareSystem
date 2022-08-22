package com.health.care.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.care.system.dao.UserRepository;
import com.health.care.system.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Boolean addUser(User user) {
		// TODO Auto-generated method stub
		this.userRepository.save(user);
		return true;
	}

	@Override
	public Boolean deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(userId);
		return true;
	}

	@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		Optional<User> user=this.userRepository.findById(userId);
		return user.get();
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}

}
