package com.xworkz.dp.dto;

public class Primnumber {

	public static void main(String[] args) {
		
		
		int number;
		int count;
		int i;
		
		System.out.println("prime number from 1 to 100");
		for(number=0; number<= 100; number++) {
			
			count=0;
			for(i =2 ;i<= number/2 ;i++) {
				
				if(number %i ==0) {
					count++;
				    break;
				}
			}
			if(count ==0 && number != 1) {
				
				System.out.println(number+ "  ");
			}
			
		}
		
	}

}
