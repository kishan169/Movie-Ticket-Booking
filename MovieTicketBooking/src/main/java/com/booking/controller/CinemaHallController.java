package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.model.CinemaHall;
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
	
	@PostMapping("link")
	public String addMovietoCinema() {
		String st = cHallService.linkMovieToCinemaHall(2, 9);
		return st;
	}
}
