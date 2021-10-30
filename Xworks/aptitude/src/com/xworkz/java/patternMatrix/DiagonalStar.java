package com.xworkz.java.patternMatrix;

public class DiagonalStar {
	
	void diaganalStarPattern() {

	for(int i = 0; i<5; i++) {
		
		for(int j= 0; j<5;j++) {
			
			if(i==j || i+j==5-1) {
			System.out.print("*");
		}else {
		
			System.out.print(" " );
		}
	}
	System.out.println();
	}
	}
	
	public static void main(String[] args) {

		DiagonalStar max = new DiagonalStar();
		max.diaganalStarPattern();
		
	}

}
