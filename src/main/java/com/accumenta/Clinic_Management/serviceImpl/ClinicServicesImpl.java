package com.accumenta.Clinic_Management.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.accumenta.Clicnic_Management.clinicRepository.ClinicRepository;
import com.accumenta.Clinic_Management.exceptions.ClinicAlreadyExistsException;
import com.accumenta.Clinic_Management.models.Clinic;
import com.accumenta.Clinic_Managementa.services.ClinicServices;

@Service
public class ClinicServicesImpl implements ClinicServices
{
    @Autowired
	private ClinicRepository repo; 
    
	@Override
	public Clinic addclinic(Clinic clinic) 
	{
		Clinic cli=this.repo.findById(clinic.getClinicId()).orElse(null);
	
		if (cli==null)
		{
			return this.repo.save(clinic);
		}
		else
		{
			throw new ClinicAlreadyExistsException("clinic Id Already Exist");
		}	
	}
	
	@Override
	public Clinic getclinic(long clinicId) {
		Clinic cli=this.repo.findById(clinicId).get();
		if (cli!=null)
		{
			return this.repo.findById(clinicId).get();
		}
		else
		{
			throw new ClinicAlreadyExistsException("clinic Id Already Exists");
		}
	}

	@Override
	public boolean deleteclinic(long clinicId) 
	{
	
		Clinic dbClinic=this.repo.findById(clinicId).get();
		if(dbClinic!=null)
		{
			this.repo.deleteById(clinicId);
			return true;
		}
		else 
		{
			throw new ClinicAlreadyExistsException("clinicId not found");	
		}		
	 }
	}

