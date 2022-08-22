package com.health.care.system.service;

import java.util.List;
import com.health.care.system.dto.DiagnosticCenter;


public interface DiagnosticCenterService {
	Boolean addDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	Boolean deleteDiagnosticCenter(Integer adiagnosticCenterId);
	DiagnosticCenter getDiagnosticCenterById(Integer diagnosticCenterId);
	DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	public List<DiagnosticCenter> getDiagnosticCenterList();


}
