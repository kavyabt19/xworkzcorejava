package com.xworkz.movie.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="booking")
public class MovieEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="type")
	private String type;
	@Column(name="movie_name")
	private String moviename;
	@Column(name="nofotickets")
	private byte nofotickets;
	@Column(name="nofosets")
	private int nofosets;

	
}
