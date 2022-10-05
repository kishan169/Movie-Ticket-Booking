package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.booking.model.Person;
import com.booking.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService pService;
	
	
	@PostMapping("add")
	public Person addUserDetailsHandler(@RequestBody Person person) {
		
		return pService.savePersonDetails(person);
	}
}
