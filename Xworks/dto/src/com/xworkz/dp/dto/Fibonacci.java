package com.xworkz.dp.dto;

public class Fibonacci {

	public static void main(String[] args) {
		 int num, a=0,b=0,c=1;
	
		 
		 System.out.println("Fibonacci Series of the number is:");
	        for (int i=0; i<10; i++) {
	            a = b;
	            b = c;
	            c = a+b;
	            System.out.println(a + "");
		 }
	}

}
