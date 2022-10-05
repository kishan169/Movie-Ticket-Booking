package com.booking.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.booking.type.PaymentStatus;

@Entity
public class Payment {
	
	private Double amount;
	
	private LocalDate createdDate;
	
	private PaymentStatus status;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer transactionId;
}
