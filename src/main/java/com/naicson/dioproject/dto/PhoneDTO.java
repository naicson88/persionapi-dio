package com.naicson.dioproject.dto;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.naicson.dioproject.enums.PhoneType;

public class PhoneDTO {
	
	private Long id;
	
	@Enumerated
	private PhoneType type;
	@NotEmpty
	@Size(min = 13, max = 14)
	private String number;
}
