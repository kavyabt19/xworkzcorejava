package Daythreetask;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the row");
		int n=sc.nextInt();
	int	n1=8;
	for (int row = 1 ; row <= n; row++ ) {
        for (int j = row ; j <n; j++ ) {
	     System.out.print("  ");
        }
        for (int col = 1 ; col <= (2*row-1); col++ ) {
        	
        if(row==n||col==(2*row-1)||col==1) {
	         System.out.print("* ");
          }
      else
    	  System.out.print("  ");
     
        
	}
	System.out.println();
	}
}
}

