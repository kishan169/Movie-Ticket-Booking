package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.model.CinemaHall;

@Repository
public interface CinemaHallDao extends JpaRepository<CinemaHall, Integer>{

}
