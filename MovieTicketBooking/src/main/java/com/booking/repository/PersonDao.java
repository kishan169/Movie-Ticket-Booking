package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.model.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}
