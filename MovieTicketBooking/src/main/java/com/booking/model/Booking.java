package com.booking.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.booking.type.BookingStatus;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	
	private Integer numOfSeat;
	
	private LocalDate bookedDate;
	
	private BookingStatus status;
	
	@ManyToOne
	private Person person;
}
