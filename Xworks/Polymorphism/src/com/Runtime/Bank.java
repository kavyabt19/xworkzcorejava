package com.Runtime;

public class Bank {

	void pay() {
		
		System.out.println(" amount recived");
	}
	
}

  class Customer extends Bank{
	  
	  @Override
	void pay() {
		
		  System.out.println("amount paid");
	}
	  
	  public static void main(String[] args) {
		
	    Customer bank= new Customer();
		  bank.pay();
		  bank.pay();
		  
	}
	 
	 
	 
 }