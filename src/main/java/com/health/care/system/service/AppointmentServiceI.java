package com.health.care.system.service;

import java.util.List;
import com.health.care.system.dto.Appointment;

public interface AppointmentServiceI {
	Boolean addAppointment(Appointment appointment);
	Boolean deleteAppointment(Integer appointmentId);
	Appointment getAppointmentById(Integer appointmentId);
	Appointment updateAppointment(Appointment appointment);
	public List<Appointment> getAppointmentList();

}
