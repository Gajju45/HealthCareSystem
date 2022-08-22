package com.health.care.system.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DiagnosticCenter {
	@Id
	private Integer centerId;
	private String centerName;
	private Integer contactNo;
	private String address;
	
	@OneToMany
	private List<Test> test;

	public DiagnosticCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DiagnosticCenter(Integer centerId, String centerName, Integer contactNo, String address, List<Test> test) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.contactNo = contactNo;
		this.address = address;
		this.test = test;
	}

	public Integer getCenterId() {
		return centerId;
	}

	public void setCenterId(Integer centerId) {
		this.centerId = centerId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public Integer getContactNo() {
		return contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Test> getTest() {
		return test;
	}

	public void setTest(List<Test> test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "DiagnosticCenter [centerId=" + centerId + ", centerName=" + centerName + ", contactNo=" + contactNo
				+ ", address=" + address + ", test=" + test + "]";
	}
	
	
	
	

}
