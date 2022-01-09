package Daytwotask;
import java.io.*;

public class SquareStar {
		
		static void print_rectangle(int row, int col)
		{
			int a, b;
			for (a = 1; a <= row; a++) {
				for (b = 1; b <= col; b++) {
					
					if (a == 1 || a == row || b == 1 || b == col)

						System.out.print("*");
					else

						
						System.out.print(" ");
				}
				System.out.println();
			}
		}

		
		public static void main(String args[])
		{
			int rows = 5, columns = 4;
			print_rectangle(rows, columns);
		}
	}



