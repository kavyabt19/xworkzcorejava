package com.xworkz.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xworkz.movie.entity.MovieEntity;

public interface movieRepo extends JpaRepository<MovieEntity, Integer>{
	
}

	


