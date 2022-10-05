package com.booking.service;

import java.util.Optional;
import java.util.Set;

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

		
		CinemaHall cHall =  chDao.save(cinemaHall);
		
		return cHall;
	}

	@Override
	public String linkMovieToCinemaHall(Integer movieId, Integer cinemaId) {
		
		Optional<Movie> mov = mDao.findById(movieId);
		
		Optional<CinemaHall> ch = chDao.findById(cinemaId);
		
		Movie movie = mov.get();
		CinemaHall chall = ch.get();
		
		System.out.println("kishan");
		movie.getCinemaHalls().add(ch.get());
		
		chall.getMovie().add(movie);
		mDao.save(movie);
		chDao.save(chall);
		return "updated...";
	}

	@Override
	public Set<Movie> getAllMovieInCinema(Integer cinemaId) {
		Optional<CinemaHall> ch = chDao.findById(cinemaId);
		CinemaHall chall = ch.get();
		System.out.print(chall.getName());
		System.out.print(chall.getMovie().size());
		return chall.getMovie();
	}

	

	
	
}
