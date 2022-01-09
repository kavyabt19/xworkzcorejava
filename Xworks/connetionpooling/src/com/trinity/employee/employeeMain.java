package com.trinity.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;    

import org.hibernate.cfg.Configuration;



public class employeeMain {

	public static void main(String[] args) {
        Configuration config = new Configuration().configure();
        config.addAnnotatedClass(Employee.class);
        SessionFactory sf = config.buildSessionFactory();
  
       Session session = sf.openSession();  
       Transaction t = session.beginTransaction();  

//         //create data
        Employee e1=new Employee();    
           e1.setId(7);    
           e1.setFirstName("prashanth");    
           e1.setLastName("s");  
       session.save(e1);
        
      //for reading the data
		
//		  e1=(Employee)session.get(Employee.class,1); t.commit();
//		  System.out.println(e1); System.out.println("successfully saved");
//		 
      
		/*
		 * //delete record Employee e11=session.get(Employee.class, 1);
		 * System.out.println(e11);
		 * 
		 * session.delete(e11);
		 */
      t.commit();
         
       session.close();     //need to comment this when we read data
   
}  

	}



