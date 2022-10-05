package com.booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.booking.model.CinemaHall;
import com.booking.model.CinemaHallSeat;
import com.booking.model.Movie;
import com.booking.repository.CinemaHallDao;
import com.booking.repository.MovieDao;
import com.booking.type.SeatType;

@Service
public class CinemaHallServiceImpl implements CinemaHallService{
	
	@Autowired
	private CinemaHallDao chDao;
	
	@Autowired
	private MovieDao mDao;

	@Override
	public CinemaHall addCinemaHallDetails(CinemaHall cinemaHall) {

		CinemaHallSeat cSeat = new CinemaHallSeat();
		cSeat.setSeatRow(20);
		cSeat.setSeatColumn(10);
		cSeat.setSeatType(SeatType.Accecible);
		
		cinemaHall.setName("Rajhans Cinema");
		cinemaHall.setNumsOfSeats(200);
		cinemaHall.setHallSeats(cSeat);
		CinemaHall cHall =  chDao.save(cinemaHall);
		
		return cHall;
	}

	@Override
	public String linkMovieToCinemaHall(Integer movieId, Integer cinemaId) {
		
		Optional<Movie> mov = mDao.findById(movieId);
		
		Optional<CinemaHall> ch = chDao.findById(cinemaId);
		
		Movie movie = mov.get();
		
		movie.getCinemaHalls().add(ch.get());
		
		
		mDao.save(movie);
		
		return "updated...";
	}
	
}
