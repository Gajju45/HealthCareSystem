package com.health.care.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health.care.system.dto.Test;
import com.health.care.system.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@PostMapping("test")
	private String addTest(@RequestBody Test test)
	{
		this.testService.addTest(test);
		return "Added Test";
	}
	@GetMapping("test/{testId}")
	private Test getTest(@PathVariable Integer testId) {
		return this.testService.getTestById(testId);
		
	}
	
	@GetMapping("tests")
	private List<Test> getTestList(){
		return this.testService.getTestList();
	}
	
	@DeleteMapping("test/{testId}")
	private String deleteTest(@PathVariable Integer TestId)
	{
		this.testService.deleteTest(TestId);
		return "delete Sucessfully";
	}
	
	
	

}
