package com.xworkz.java.patternMatrix;

public class RightDiagonal {

	void rightDiagonalMatrix() {

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row == col) {
					System.out.print(row+col+ "\t");
				} else {
					System.out.print("\t");
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		RightDiagonal rightDiagonal = new RightDiagonal();
		rightDiagonal.rightDiagonalMatrix();

	}

}
