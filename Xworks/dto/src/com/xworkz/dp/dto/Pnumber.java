package com.xworkz.dp.dto;

public class Pnumber {

	public static void main(String[] args) {
		
		
		
		int idea, infinity,pnum;
		
		System.out.println("the prime number from 1 to 100");
		for(idea =0; idea <=100; idea++) {
			
			pnum=0;
			for(infinity =2;infinity<=idea/2;infinity++) {
				
				if(idea%infinity == 0) {
					
				
					pnum++;
				break;
				}
			}
			
			if(pnum == 0 && idea != 1) {
				System.out.println(idea);
			}
		}
		
	}

}
