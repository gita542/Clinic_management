package com.accumenta.Clinic_Management.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.accumenta.Clinic_Management.dto.ResponseWrapper;
import com.accumenta.Clinic_Management.exceptions.ClinicAlreadyExistsException;
import com.accumenta.Clinic_Management.exceptions.ServicesAlreadyExistsException;

public class GlobalExceptionsHandler 
{
	@ExceptionHandler(ClinicAlreadyExistsException.class)
	ResponseEntity<ResponseWrapper>clinicAlreadyExists(ClinicAlreadyExistsException ex)
	{
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseWrapper(ex));
	}
	@ExceptionHandler(ServicesAlreadyExistsException.class)
	ResponseEntity<ResponseWrapper>ServicesAlreadyExists(ServicesAlreadyExistsException ex)
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseWrapper(ex));
		}
	}
	

