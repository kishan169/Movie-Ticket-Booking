package com.booking.model;

import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;

import com.booking.type.PersonType;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	private String name;
	
	@Embedded
	@JsonIgnore
	private Address address;
	
	private String email;
	
	private String phone;
	
	private PersonType persontype = PersonType.User;
	
	@OneToMany
	@JsonIgnore
	private Set<Movie> movies;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public PersonType getPersontype() {
		return persontype;
	}

	public void setPersontype(PersonType persontype) {
		this.persontype = persontype;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	public Person(Integer userId, String name, Address address, String email, String phone, PersonType persontype,
			Set<Movie> movies) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.persontype = persontype;
		this.movies = movies;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
