package com.health.care.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.care.system.dto.DiagnosticCenter;

public interface DiagnosticCenterRepository extends JpaRepository<DiagnosticCenter, Integer> {

}
