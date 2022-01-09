package com.xworkz.movie.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.movie.DTO.ticketBookingDTO;
import com.xworkz.movie.entity.MovieEntity;
import com.xworkz.movie.repository.movieRepo;

import lombok.Getter;

@RestController
public class movieticketbookingcontroller {
	
	@Autowired
	movieRepo repo;
	
	@PostMapping("booking")
	public String savedetails(@RequestBody ticketBookingDTO dto) {
		MovieEntity movie = new MovieEntity();
		BeanUtils.copyProperties(dto, movie);
		repo.save(movie);
		return dto.getName()+" check the db";
		
		
	}
	
	

}
