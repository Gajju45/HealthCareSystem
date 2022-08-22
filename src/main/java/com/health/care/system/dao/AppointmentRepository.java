package com.health.care.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.care.system.dto.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
