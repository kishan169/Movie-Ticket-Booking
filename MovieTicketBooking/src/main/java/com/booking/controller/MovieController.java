package com.booking.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.booking.model.CinemaHall;
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
	
	@GetMapping("getList/{id}")
	public Set<CinemaHall> getTheatreListFortheseMovie(@PathVariable("id") Integer movieId){
		 Set<CinemaHall> list =  mService.getCinemaList(movieId);
		 return list;
	}
}
