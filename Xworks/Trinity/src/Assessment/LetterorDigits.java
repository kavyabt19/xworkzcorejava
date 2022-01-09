package Assessment;

import java.util.Scanner;

public class LetterorDigits {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("********************Program Start********************");
		 System.out.println(" \n");
		System.out.println("    Enter the String ");
		String str=sc.next();
		    
		      if(str.matches("[0-9]+") && str.length() > 2) {
		         System.out.println("String contains only digits!");
		      } 
		      else  if(str.length() == 2) {
		    	  System.out.println("String contains only characters!");
		      }
		    	  else {
		         System.out.println("String contains digits as well as other characters!");
		      }
		      
		      System.out.println(" \n");
			   	 System.out.println("********************Program End********************");
		   }
		
	}

