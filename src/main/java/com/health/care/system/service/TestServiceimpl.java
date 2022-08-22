package com.health.care.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.care.system.dao.TestRepository;
import com.health.care.system.dto.Test;

@Service
public class TestServiceimpl implements TestService {

	@Autowired
	TestRepository testRepository;
	@Override
	public Boolean addTest(Test test) {
		this.testRepository.save(test);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean deleteTest(Integer testId) {
		// TODO Auto-generated method stub
		this.testRepository.deleteById(testId);
		return true;
	}

	@Override
	public Test getTestById(Integer testId) {
		// TODO Auto-generated method stub
		Optional<Test> test=this.testRepository.findById(testId);
		return test.get();
	}

	@Override
	public Test updateTest(Test test) {
		// TODO Auto-generated method stub
		
		return this.testRepository.save(test);
	}

	@Override
	public List<Test> getTestList() {
		// TODO Auto-generated method stub
		return this.testRepository.findAll();
	}

}
