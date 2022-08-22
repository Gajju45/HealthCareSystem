package com.health.care.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.care.system.dao.DiagnosticCenterRepository;
import com.health.care.system.dto.DiagnosticCenter;

@Service
public class DiagnosticCenterServieImpl  implements DiagnosticCenterService{
	
	@Autowired
	DiagnosticCenterRepository diagnosticCenterRepository;

	@Override
	public Boolean addDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		this.diagnosticCenterRepository.save(diagnosticCenter);
		return true;
	}

	@Override
	public Boolean deleteDiagnosticCenter(Integer adiagnosticCenterId) {
		this.diagnosticCenterRepository.deleteById(adiagnosticCenterId);
		return true;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenterById(Integer diagnosticCenterId) {
		// TODO Auto-generated method stub
		
		Optional<DiagnosticCenter>  diagnosticCenterRepository=this.diagnosticCenterRepository.findById(diagnosticCenterId);
		return diagnosticCenterRepository.get();
	}

	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return this.diagnosticCenterRepository.save(diagnosticCenter);
	}

	@Override
	public List<DiagnosticCenter> getDiagnosticCenterList() {
		// TODO Auto-generated method stub
		
		return this.diagnosticCenterRepository.findAll();
	}

}
