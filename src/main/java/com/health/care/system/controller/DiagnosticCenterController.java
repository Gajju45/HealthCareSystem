package com.health.care.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.health.care.system.dto.DiagnosticCenter;
import com.health.care.system.service.DiagnosticCenterService;

@RestController
public class DiagnosticCenterController {

	@Autowired
	private DiagnosticCenterService diagnosticCenterService;

	@PostMapping("DiagnosticCenter")
	private String addDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenterService.addDiagnosticCenter(diagnosticCenter);
		return "Added Successfully";
	}

	@GetMapping("DiagnosticCenter/{diagnosticCenterId}")
	private DiagnosticCenter getdiagnosticCenter(@PathVariable Integer diagnosticCenterId) {
		return this.diagnosticCenterService.getDiagnosticCenterById(diagnosticCenterId);
	}

	@GetMapping("DiagnosticCenter")
	private List< DiagnosticCenter> getdiagnosticCenter() {
		return this.diagnosticCenterService.getDiagnosticCenterList();
	}

	@DeleteMapping("DiagnosticCenter/{diagnosticCenterId}")
	private String deleteDiagnosticCenter(@PathVariable Integer diagnosticCenterId) {
		this.diagnosticCenterService.deleteDiagnosticCenter(diagnosticCenterId);
		return "Delete Successfully";
	}

}
