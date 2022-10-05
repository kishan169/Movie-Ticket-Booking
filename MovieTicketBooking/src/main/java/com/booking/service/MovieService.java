package com.booking.service;

import java.util.Set;

import com.booking.model.CinemaHall;
import com.booking.model.Movie;

public interface MovieService {
	
	public Movie addMovieDetails(Movie movie);
	
	public Set<CinemaHall> getCinemaList(Integer movieId);
}
