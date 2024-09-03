package com.accumenta.Clinic_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accumenta.Clinic_Management.dto.ResponseWrapper;
import com.accumenta.Clinic_Management.models.Clinic;
import com.accumenta.Clinic_Management.models.Services;
import com.accumenta.Clinic_Managementa.services.ClinicServices;
import com.accumenta.Clinic_Managementa.services.ServicesService;

@RestController
public class ClinicServicesController 
{
	@Autowired
	private ClinicServices  service;
	@Autowired
	private ServicesService ser;
	
	@PostMapping("/api/clinic")
	public ResponseEntity<ResponseWrapper> createClinic (@RequestBody Clinic clinic)
	{
		Clinic dbcli=this.service.addclinic(clinic);
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseWrapper(dbcli));
	}

	@PostMapping("/api/service")
	public ResponseEntity<ResponseWrapper> createServices (@RequestBody Services services)
	{
		Services dbser=this.ser.addService(services);
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseWrapper(dbser));
	} 
	
	@GetMapping("/api/clinic/{clinicId}")
	public ResponseEntity<ResponseWrapper> getclinic (@PathVariable long clinicId)
	{
		Clinic dbclinic=this.service.getclinic(clinicId);
             return ResponseEntity.status(HttpStatus.OK).body(new ResponseWrapper<>(dbclinic));
		}
	@GetMapping("/api/service/{serviceId}")
	public ResponseEntity<ResponseWrapper> getservices (@PathVariable long serviceId)
	{
		Services dbservice=this.ser.getservice(serviceId);
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseWrapper<>(dbservice));
	}
	
	@DeleteMapping("/api/clinic/{clinicId}")
	public ResponseEntity<ResponseWrapper> deleteClinic (@PathVariable long clinicId)
	{
		boolean dbclinic=this.service.deleteclinic(clinicId );
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseWrapper<>(dbclinic));
	}
	
	@DeleteMapping("/api/service/{serviceId}")
	public ResponseEntity<ResponseWrapper>deleteServices (@PathVariable long serviceId)
	{
		boolean dbservice=this.ser.deleteServcie(serviceId);
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseWrapper<>(dbservice));
	}
	
}
