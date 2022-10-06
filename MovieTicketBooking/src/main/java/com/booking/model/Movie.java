package com.booking.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.asm.Advice.Local;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;
	
	private String title;
	
	private String description;
	
	private Integer duration;
	
	private String language;
	
	private LocalDate releaseDate;
	
	private String country;
	
	private String genre;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "movie")
	@JsonIgnore
	private Set<CinemaHall> cinemaHalls = new HashSet<>();

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Set<CinemaHall> getCinemaHalls() {
		return cinemaHalls;
	}

	public void setCinemaHalls(Set<CinemaHall> cinemaHalls) {
		this.cinemaHalls = cinemaHalls;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(cinemaHalls, country, description, duration, genre, language, movieId, releaseDate, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(cinemaHalls, other.cinemaHalls) && Objects.equals(country, other.country)
				&& Objects.equals(description, other.description) && Objects.equals(duration, other.duration)
				&& Objects.equals(genre, other.genre) && Objects.equals(language, other.language)
				&& Objects.equals(movieId, other.movieId) && Objects.equals(releaseDate, other.releaseDate)
				&& Objects.equals(title, other.title);
	}
	
	
}
