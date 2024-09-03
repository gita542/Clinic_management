package com.accumenta.Clinic_Management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class ResponseWrapper<T>
{
	private String object;
	private T message;
	public ResponseWrapper(String object) {
		super();
		this.object = object;
	}
	public ResponseWrapper(T message) {
		super();
		this.message = message;
	}

	
}
