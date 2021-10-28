package com.xworkz.dp.dto;

public class Mulitiplication {

	static int muliply(int n) {
		
		return( n << 1) +( n<< 3);
		
	}
	
	public static void main(String[] args) {
  		
      int n=20;
      System.out.println(muliply(n));
	}

}
