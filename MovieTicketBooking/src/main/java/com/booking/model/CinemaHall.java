package com.booking.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CinemaHall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cinemaId;
	
	private String name;
	
	private Integer numsOfSeats;
	
	@Embedded
	@JsonIgnore
	private CinemaHallSeat hallSeats;
	
	
	public CinemaHall() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(Integer cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumsOfSeats() {
		return numsOfSeats;
	}

	public void setNumsOfSeats(Integer numsOfSeats) {
		this.numsOfSeats = numsOfSeats;
	}

	public CinemaHallSeat getHallSeats() {
		return hallSeats;
	}

	public void setHallSeats(CinemaHallSeat hallSeats) {
		this.hallSeats = hallSeats;
	}

	
	
	
	
}
