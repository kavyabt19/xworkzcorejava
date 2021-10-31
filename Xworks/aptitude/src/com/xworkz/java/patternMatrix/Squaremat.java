package com.xworkz.java.patternMatrix;

public class Squaremat {
	
	 void squarematrix(){
		 
		 for(int row = 1;row <=5;row++){
		  for(int col = 1;col<=5;col++){
		  
		  if(row==1||row==row||col==1||col==col){
		  System.out.print(row+""+col+"\t");
		  }else{
			  System.out.print("\t");
		  }
		  System.out.println();
		   }
		 }
	  }

	public static void main(String[] args) {

		 Squaremat sq=new Squaremat();
		  sq.squarematrix();
	   }
	}

}
