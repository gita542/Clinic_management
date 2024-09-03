package com.accumenta.Clinic_Managementa.services;

import com.accumenta.Clinic_Management.models.Services;

public interface ServicesService 
{
	Services addService(Services service);

	boolean deleteServcie(long serviceId);
	Services getservice(long serviceId);




	
}
