package com.xworkz.java.patternMatrix;

public class SquareMatrix {

	void matrixindex() {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				//if (row == col) {
					System.out.print(row + "" + col + "\t");
				//} else {
				//	System.out.print("\t");
				//}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		SquareMatrix sqMatrix = new SquareMatrix();
		sqMatrix.matrixindex();

	}

}
