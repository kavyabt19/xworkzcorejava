package com.xworkz.hobbies.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.hobbies.dto.hobbiesdto;
import com.xworkz.hobbies.entity.hobbiesentity;
import com.xworkz.hobbies.repository.hobbiesrepository;


@RestController

public class hobbiesController {

	


	
		
		@Autowired
		hobbiesrepository repo;
		
		@PostMapping("hobbies")
		public String savedetails(@RequestBody hobbiesdto dto) {
			hobbiesentity activity = new hobbiesentity();
			BeanUtils.copyProperties(dto, activity);
			repo.save(activity);
			return dto.getName()+" check the db";
}
}
