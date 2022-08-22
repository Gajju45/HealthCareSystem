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

import com.health.care.system.dto.Appointment;
import com.health.care.system.service.AppointmentServiceI;

@RestController
public class AppointmentController {

	@Autowired
	private AppointmentServiceI appointmentServiceI;

	@PostMapping("appointment")
	private String addAppointment(@RequestBody Appointment appointment) {
		this.appointmentServiceI.addAppointment(appointment);
		return "Appointment Added Successfully";
	}

	@GetMapping("appointment/{appointmentId}")
	private Appointment getAppointmentById(@PathVariable Integer appointmentId) {

		return this.appointmentServiceI.getAppointmentById(appointmentId);
	}

	@GetMapping("appointments")
	private List<Appointment> getAppointments() {
		return this.appointmentServiceI.getAppointmentList();
	}

	@DeleteMapping("appointment/{appointmentId}")
	private String deleteAppointment(@PathVariable Integer appointmentId) {
		
		this.appointmentServiceI.deleteAppointment(appointmentId);

		return "Delete Successfully";
	}

}
