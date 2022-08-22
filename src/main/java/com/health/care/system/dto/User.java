package com.health.care.system.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	private Integer userId;
	private String userEmail;
	private String userPassword;
	private String userName;
	private String usercontactNo;
	private String uerGender;
	private Integer userAge;
	
	@OneToOne
	private Appointment appointment;
	@OneToMany
	private List<DiagnosticCenter> diagnosticCenter;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer userId, String userEmail, String userPassword, String userName, String usercontactNo,
			String uerGender, Integer userAge, Appointment appointment, List<DiagnosticCenter> diagnosticCenter) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userName = userName;
		this.usercontactNo = usercontactNo;
		this.uerGender = uerGender;
		this.userAge = userAge;
		this.appointment = appointment;
		this.diagnosticCenter = diagnosticCenter;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUsercontactNo() {
		return usercontactNo;
	}
	public void setUsercontactNo(String usercontactNo) {
		this.usercontactNo = usercontactNo;
	}
	public String getUerGender() {
		return uerGender;
	}
	public void setUerGender(String uerGender) {
		this.uerGender = uerGender;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public List<DiagnosticCenter> getDiagnosticCenter() {
		return diagnosticCenter;
	}
	public void setDiagnosticCenter(List<DiagnosticCenter> diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", userName="
				+ userName + ", usercontactNo=" + usercontactNo + ", uerGender=" + uerGender + ", userAge=" + userAge
				+ ", appointment=" + appointment + ", diagnosticCenter=" + diagnosticCenter + "]";
	}
	
	
	
	
}
