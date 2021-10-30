package com.xworkz.java.patternMatrix;

public class SquareStarMatrix {

	void increaseStarTriangleMatrix() {

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {

				System.out.print("*");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		SquareStarMatrix matrix = new SquareStarMatrix();

		matrix.increaseStarTriangleMatrix();

	}

}
