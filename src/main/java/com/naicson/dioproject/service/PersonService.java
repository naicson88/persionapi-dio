package com.naicson.dioproject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.naicson.dioproject.dto.MessageResponseDTO;
import com.naicson.dioproject.entity.Person;
import com.naicson.dioproject.repositry.PersonRepository;

@Service
public class PersonService {
	
	
	private PersonRepository personRepository;
	
	private PersonService(PersonRepository personRespository) {
		this.personRepository = personRespository;
	}
	
	public MessageResponseDTO createPerson(@RequestBody Person person) {
		Person savedPerson = personRepository.save(person);
		return MessageResponseDTO.builder().message("Created person with ID " + savedPerson.getId()).build();
		
		
	}
}
