package com.naicson.dioproject.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naicson.dioproject.entity.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
