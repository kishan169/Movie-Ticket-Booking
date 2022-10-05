package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.booking.model.Movie;
import com.booking.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService mService;
	
	@PostMapping("movie")
	public Movie addMovieDetailsImpl(@RequestBody Movie movie) {
		
		return mService.addMovieDetails(movie);
	}
}
