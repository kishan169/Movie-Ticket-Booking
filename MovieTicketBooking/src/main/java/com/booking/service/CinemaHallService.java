package com.booking.service;

import com.booking.model.CinemaHall;

public interface CinemaHallService {
	public CinemaHall addCinemaHallDetails(CinemaHall cinemaHall);
	
	public String linkMovieToCinemaHall(Integer movieId, Integer cinemaId);
}
