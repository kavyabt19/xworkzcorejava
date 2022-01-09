package Dayonetask;

import java.util.Scanner;

public class StarPattern {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row");
		int r=sc.nextInt();
		System.out.println("Enter the col");
		int c=sc.nextInt();
		
				StarPattern sp=new StarPattern();
			  sp.starPattern( r, c);
		   }
		     void starPattern(int r, int c){
				 int n=7;
			 int mid=(r/2)+1;
			 if(r%2!=0) {
				 for(int row = 1;row <=r;row++){
				  for(int col = 1;col<=c;col++){
					 
					  if(row==mid||col==mid){
						  
				 System.out.print(" *  \t");
				  
				  }if(row>=mid|| col<=mid) {
					  System.out.print(" *  \t");
				  }
					  else {
					  System.out.print("\t");
				  }
				  
				  }
				   System.out.println();
				 
			  }
				 }
				   
				
				  
				    }
				    
				

		}
		


