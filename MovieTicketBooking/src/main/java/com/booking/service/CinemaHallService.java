package com.booking.service;

import java.util.Set;

import com.booking.model.CinemaHall;
import com.booking.model.Movie;

public interface CinemaHallService {
	public CinemaHall addCinemaHallDetails(CinemaHall cinemaHall);
	
	public String linkMovieToCinemaHall(Integer movieId, Integer cinemaId);
	
	public Set<Movie> getAllMovieInCinema(Integer cinemaId);
}
