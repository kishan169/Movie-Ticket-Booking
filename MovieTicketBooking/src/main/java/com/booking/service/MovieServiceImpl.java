package com.booking.service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.model.CinemaHall;
import com.booking.model.Movie;
import com.booking.repository.MovieDao;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieDao mDao;

	@Override
	public Movie addMovieDetails(Movie movie) {
		
		
		Movie mov = mDao.save(movie);
		
		return mov;
	}

	@Override
	public Set<CinemaHall> getCinemaList(Integer movieId) {
		
		Optional<Movie> mov = mDao.findById(movieId);
		
		return mov.get().getCinemaHalls();
	}
	
	

}
