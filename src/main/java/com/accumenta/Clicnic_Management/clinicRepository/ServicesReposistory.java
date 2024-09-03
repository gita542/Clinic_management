package com.accumenta.Clicnic_Management.clinicRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.accumenta.Clinic_Management.models.Services;

public interface ServicesReposistory extends JpaRepository<Services, Long>
{
     
	@Query("select c from Services c where c.serviceName=:serviceName")
	Services findbyName(@Param("serviceName") String serviceName);
}
