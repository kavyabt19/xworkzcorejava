package com.trinity.firstProject;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;




 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
   
    private UserRepository repo;
    
    @Test
    public void testCreateUser() {
        User user = new User();
        user.setEmail("kavyabt48@gmail.com");
        user.setPassword("kavya48");
        user.setFirstName("kavya");
        user.setLastName("BT");
         
        User saveduser = repo.save(user);
         

        User existuser = entityManager.find(User.class, saveduser.getId());
         
        assertThat(existuser.getEmail()).isEqualTo(user.getEmail());
         
    }
//    @Test
//    public void testFindUserByEmail() {
//    	String email = "name@gmail.com";
//    	
//    	user user = repo.findByEmail(email);
//    	
//    	assertThat(user).isNotNull();
//    }
//    
}
