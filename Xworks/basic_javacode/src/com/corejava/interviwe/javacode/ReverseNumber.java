package com.corejava.interviwe.javacode;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	// scanner is use to read the inputs from user
		System.out.println("Enter the number");
		int num=sc.nextInt();
		// here sc is the object and nextint is the method
		//the num which contine the input enter by the user
		
		// 1.using algo
//		int rev=0;
//		
//		while(num!=0)
//		{
//			rev=rev*10 + num%10; // 0*10 + 1234%10 which will eleminate all val and hv 4   
//			                     // 4*10 +123%10 = 40+3=43
//			                     // 3*10 + 12%10 = 30+2=32
//			num=num/10; //here in 123 will be restor and loop will contine
//		                //123/10 12
//		}
//		System.out.println( "revers of the given number is : "+rev);
//		
		
		
		
		
		
		// using stringBuffer 
		
//		StringBuffer rev; //variable string is the stringBuffer type
//		
//		// to convert int num int string we use string valueOf method and that string 
//		// value is store into str
//				                                   
//		StringBuffer str= new StringBuffer(String.valueOf(num))	;	
//		rev=str.reverse();//revers will store in the str that store to rev
//		
//		System.out.println( "revers of the given number is : "+rev);
		
		
	
		
	
		//using stringbuildre 
		
		StringBuilder sb= new StringBuilder();
	     sb.append(num);
		StringBuilder rev =sb.reverse();
		System.out.println( "revers of the given number is : "+rev);
		
	}

}
