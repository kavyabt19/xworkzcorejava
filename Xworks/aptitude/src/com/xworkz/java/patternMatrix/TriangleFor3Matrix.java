package com.xworkz.java.patternMatrix;

import java.util.Scanner;

public class TriangleFor3Matrix {

	Scanner sc = new Scanner(System.in);
	 
	void triangle3Matrix() {
		System.out.println("Enter  the row and col :");
		int n=5;
		for (int row = 1; row <= n; row++) {
			
			for (int col = row; col <= n; col++) {

				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		TriangleFor3Matrix matrix = new TriangleFor3Matrix();
		matrix.triangle3Matrix();
	}

}
