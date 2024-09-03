package com.accumenta.Clicnic_Management.clinicRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.accumenta.Clinic_Management.models.Clinic;

public interface ClinicRepository extends JpaRepository<Clinic, Long>
{
	@Query("select c from Clinic c where c.clinicName=:clinicName")
	Clinic findbyName(@Param("clinicName") String clinicName);
}
 