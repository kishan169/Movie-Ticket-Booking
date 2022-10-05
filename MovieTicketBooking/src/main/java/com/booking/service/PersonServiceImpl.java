package com.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.model.Address;
import com.booking.model.Person;
import com.booking.repository.PersonDao;
import com.booking.type.PersonType;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDao pDao;

	@Override
	public Person savePersonDetails(Person person) {
//		person.setPersontype(PersonType.Admin);
//		person.setEmail("anpatel199@gmail.com");
//		person.setName("ankur Patel");
//		person.setPhone("9998373476");
		person.setAddress(new Address("ahmedabad", "gujarat", "382350", "India", "Uttamnagar", "80 feet road"));
		Person per = pDao.save(person);
		
		return per;
	}
	
	

}
