package com.health.care.system.service;

import java.util.List;

import com.health.care.system.dto.Test;

public interface TestService {
	Boolean addTest(Test test);
	Boolean deleteTest(Integer testId);
	Test getTestById(Integer testId);
	Test updateTest(Test test);
	public List<Test> getTestList();

}
