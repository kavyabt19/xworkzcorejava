package com.xworkz.dp.dto;

public class TwoNumber {

	public static void main(String[] args) {


		int x =10;
		int y =20;
		
		System.out.println("Before swap x \n "+x+" y \n"+y);
		
		x= x+y;
		y=x-y;
		x=y-x;
		
		System.out.println("after swap  x \n "+x+ "  y \n"+y);

	}

}
