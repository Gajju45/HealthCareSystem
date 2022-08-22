package com.health.care.system.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
	@Id
	private Integer testId;
	private String testName;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(Integer testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + "]";
	}
	
	

}
