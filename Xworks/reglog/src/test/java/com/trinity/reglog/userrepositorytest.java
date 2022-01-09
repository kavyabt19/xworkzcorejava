package com.trinity.reglog;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.trinity.reglog.user;
import com.trinity.reglog.userrepository;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class userrepositorytest {

	
	
	  @Autowired
	    private userrepository repo;
	     

         @Autowired
		    private TestEntityManager entityManager;
		     
		  
		    @Test
		    public void testCreateUser() {
		        user user = new user();
		        user.setEmail("kavyabt48@gmail.com");
		        user.setPassword("kavya48");
		        user.setFirstName("kavya");
		        user.setLastName("BT");
		         
		        user saveduser = repo.save(user);
		         

		        user existuser = entityManager.find(user.class, saveduser.getId());
		         
		        assertThat(existuser.getEmail()).isEqualTo(user.getEmail());
		         
		    }
		    @Test
		    public void testFindByEmail() {
		    	String email = "name@trinit.com";
		    	
		    	user user = repo.findByEmail(email);
		    	
		    	assertThat(user).isNotNull();
		    }
		    
		}




