package com.booking.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	

}
