package com.corejava.interviwe.javacode;

import java.util.Scanner;

// Palindrome is a Number which remain same when its digits are reverse like 12345

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
	     int num = sc.nextInt();
	      int orgNum= num;
          int rev=0;
	    
	    while(num!=0) {
	    	
	    	rev=rev*10 +num%10;
	    	num=num/10;
	    }
	    
	   // System.out.println(rev);
	    if(orgNum==rev) {
	    	
	    	System.out.println(orgNum+" Palindrome Number");
	    }
	    else
	    {
	    	System.out.println(orgNum+"Not a Palindrome Number");
	    }
	    
	}

}
