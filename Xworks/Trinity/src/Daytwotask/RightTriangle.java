package Daytwotask;

import java.util.Scanner;

public class RightTriangle {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows=sc.nextInt();    
		for(int i=1; i<=rows; i++){
		  for(int j=i; j<=rows; j++){
		  
		  if(i==1 || j==i || j==rows){
		     System.out.print("* "); 
		     }
		     else{
		     System.out.print("  ");
		}
		}
		System.out.println();
		}
		}
		}

