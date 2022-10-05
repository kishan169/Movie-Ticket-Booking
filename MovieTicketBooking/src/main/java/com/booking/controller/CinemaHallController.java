package com.booking.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.model.CinemaHall;
import com.booking.model.Movie;
import com.booking.service.CinemaHallService;


@RestController
public class CinemaHallController {
	
	@Autowired
	private CinemaHallService cHallService;
	
	
	@PostMapping("cinema")
	public CinemaHall addCinemaDetail(CinemaHall cinemaHall) {
		
		CinemaHall ch = cHallService.addCinemaHallDetails(cinemaHall);
		
		return ch;
	}
	
	@PostMapping("link/{mi}/{ci}")
	public String addMovietoCinema(@PathVariable("mi") Integer movieId,@PathVariable("ci") Integer cinemaId) {
		String st = cHallService.linkMovieToCinemaHall(movieId, cinemaId);
		return st;
	}
	
	@GetMapping("getmovie/{id}")
	public Set<Movie> getAllTheMovieFromCinema(@PathVariable("id") Integer cinemaId){
		Set<Movie> movies =  cHallService.getAllMovieInCinema(cinemaId);
		return movies;
	}
}
