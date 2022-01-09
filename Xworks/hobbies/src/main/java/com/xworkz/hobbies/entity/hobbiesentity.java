package com.xworkz.hobbies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@Table(name="activity")

public class hobbiesentity {
	
	
        @Id
		@Column(name="id")
		private int id;
		@Column(name="name")
		private String name;
		@Column(name="hobbies")
		private String hobbies;

		
	}



