package com.naicson.dioproject.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naicson.dioproject.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
