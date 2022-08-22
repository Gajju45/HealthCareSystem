package com.health.care.system.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.health.care.system.dao.AppointmentRepository;
import com.health.care.system.dto.Appointment;



@Service
public class AppointmentServiceImpl implements AppointmentServiceI {
	
	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public Boolean addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		this.appointmentRepository.save(appointment);
		return true;
	}

	@Override
	public Boolean deleteAppointment(Integer appointmentId) {
		// TODO Auto-generated method stub
		this.appointmentRepository.deleteById(appointmentId);
		return true;
	}

	@Override
	public Appointment getAppointmentById(Integer appointmentId) {
		Optional<Appointment> appointment= this.appointmentRepository.findById(appointmentId);
		return appointment.get();
	 
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		this.appointmentRepository.save(appointment);
		return appointment;
	}

	@Override
	public List<Appointment> getAppointmentList() {
		return appointmentRepository.findAll();
	}

}
