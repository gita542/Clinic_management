package com.accumenta.Clinic_Managementa.services;

import com.accumenta.Clinic_Management.models.Clinic;

public interface ClinicServices 
{
	Clinic addclinic(Clinic clinic);
	Clinic getclinic(long clinicId);
	boolean deleteclinic(long clinicId);
	
}
