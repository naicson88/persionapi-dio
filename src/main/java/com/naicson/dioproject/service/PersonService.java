package com.naicson.dioproject.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.naicson.dioproject.dto.MessageResponseDTO;
import com.naicson.dioproject.dto.PersonDTO;
import com.naicson.dioproject.entity.Person;
import com.naicson.dioproject.mapper.PersonMapper;
import com.naicson.dioproject.repositry.PersonRepository;

@Service
public class PersonService {
	
	
	private PersonRepository personRepository;
	
	private final PersonMapper personMapper = PersonMapper.INSTANCE;
	
	private PersonService(PersonRepository personRespository) {
		this.personRepository = personRespository;
	}
	
	
	public MessageResponseDTO createPerson(@RequestBody PersonDTO personDTO) {
		Person personToSave = personMapper.toModel(personDTO);
		
		Person savedPerson = personRepository.save(personToSave);
		
		return MessageResponseDTO.builder().message("Created person with ID " + savedPerson.getId()).build();
		
		
	}

	
	public List<PersonDTO> listAll() {
		List<Person> allPeople = personRepository.findAll();
		return allPeople.stream()
		.map(personMapper::toDTO)
		.collect(Collectors.toList());
	}
}
