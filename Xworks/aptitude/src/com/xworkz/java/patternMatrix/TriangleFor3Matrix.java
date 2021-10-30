package com.xworkz.java.patternMatrix;

public class TriangleFor3Matrix {

	void triangle3Matrix() {

		for (int row = 1; row <= 5; row++) {
			for (int col = row; col <= 5; col++) {

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
