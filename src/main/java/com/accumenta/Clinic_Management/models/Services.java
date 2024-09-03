package com.accumenta.Clinic_Management.models;

import com.accumenta.Clinic_Management.enumeration.Consultation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Services 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long serviceId;
	private String serviceName;
	private double serviceCode;
	private String description;
	private double averageprice;
	private boolean isactive;
	
	@Enumerated(EnumType.STRING)
	private Consultation consultation;
	
	
	@ManyToOne
	@JoinColumn(name="clinic_Id")
	private Clinic clinic;

	
}
 