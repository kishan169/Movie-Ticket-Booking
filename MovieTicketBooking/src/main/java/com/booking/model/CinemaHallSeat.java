package com.booking.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.booking.type.SeatType;


public class CinemaHallSeat {
	
	private Integer seatRow;
	
	private Integer seatColumn;
	
	private SeatType seatType;

	public Integer getSeatRow() {
		return seatRow;
	}

	public void setSeatRow(Integer seatRow) {
		this.seatRow = seatRow;
	}

	public Integer getSeatColumn() {
		return seatColumn;
	}

	public void setSeatColumn(Integer seatColumn) {
		this.seatColumn = seatColumn;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public CinemaHallSeat(Integer seatRow, Integer seatColumn, SeatType seatType) {
		super();
		this.seatRow = seatRow;
		this.seatColumn = seatColumn;
		this.seatType = seatType;
	}

	public CinemaHallSeat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
