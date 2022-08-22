package com.health.care.system.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Appointment {
	@Id
	private Integer appoitmentId;
	private String appoitmentStatus;
	private Date dateTime;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(Integer appoitmentId, String appoitmentStatus, Date dateTime) {
		super();
		this.appoitmentId = appoitmentId;
		this.appoitmentStatus = appoitmentStatus;
		this.dateTime = dateTime;
	}
	public Integer getAppoitmentId() {
		return appoitmentId;
	}
	public void setAppoitmentId(Integer appoitmentId) {
		this.appoitmentId = appoitmentId;
	}
	public String getAppoitmentStatus() {
		return appoitmentStatus;
	}
	public void setAppoitmentStatus(String appoitmentStatus) {
		this.appoitmentStatus = appoitmentStatus;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "Appointment [appoitmentId=" + appoitmentId + ", appoitmentStatus=" + appoitmentStatus + ", dateTime="
				+ dateTime + "]";
	}
	
	
	
	
	

}
