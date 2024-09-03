package com.accumenta.Clinic_Management.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Clinic 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long clinicId;
	private String clinicName;
      private String bussinessName;
      private String streetAddress;
      private String City;
      private String State;
      private String Country;
      private long Zipcode;
      private double Latitude;
      private double Longitude;
      private LocalDate datecreated;
      
      

      

	
}
