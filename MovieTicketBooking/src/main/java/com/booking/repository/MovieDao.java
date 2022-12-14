package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.model.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer>{

}
