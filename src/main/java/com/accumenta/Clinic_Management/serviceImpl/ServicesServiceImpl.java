package com.accumenta.Clinic_Management.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accumenta.Clicnic_Management.clinicRepository.ServicesReposistory;
import com.accumenta.Clinic_Management.exceptions.ServiceIdAlreadyExistsException;
import com.accumenta.Clinic_Management.exceptions.ServicesAlreadyExistsException;
import com.accumenta.Clinic_Management.models.Clinic;
import com.accumenta.Clinic_Management.models.Services;
import com.accumenta.Clinic_Managementa.services.ServicesService;


@Service
public class ServicesServiceImpl implements ServicesService
{
 @Autowired
	  private ServicesReposistory repo;
	@Override
	public Services addService(Services service) 
	{
		Services ser=this.repo.findById(service.getServiceId()).orElse(null);
		
		if (ser==null)
		{
			return this.repo.save(service);
		}
		else
		{
			throw new ServicesAlreadyExistsException("service Id Already Exist");
		}
	}

	@Override
	public Services getservice(long serviceId) 
	{
		Services ser=this.repo.findById(serviceId).get();
		if (ser!=null)
		{
			return this.repo.findById(serviceId).get();
		}
		else
		{
			throw new ServiceIdAlreadyExistsException("service Id Already Exists");
		}
	}
	@Override
	public boolean deleteServcie(long serviceId)
	{
		Services dbService=this.repo.findById(serviceId).get();
		
		if (dbService!=null)
		{
			this.repo.delete(dbService);
			return true;
		}
		else
		{
			throw new ServiceIdAlreadyExistsException("servcie Id Already Exists");
		}
	}	
}
