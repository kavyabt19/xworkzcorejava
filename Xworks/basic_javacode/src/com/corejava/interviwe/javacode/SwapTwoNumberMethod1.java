
//Swapping two numbers  using third variables 

package com.corejava.interviwe.javacode;

public class SwapTwoNumberMethod1 {

	public static void main(String[] args) {
		
		int a=10,b=20,temp;
		
		System.out.println("Before swapping value of  \n"+a +"\n"+b);
		
		// using 3rd variable
		
//		temp=a;//0=10;so a stored in temp =10
//		a=b;//b in a=20;
//		b=temp;
		
		
		// without using 3rd variable using + and -
		
//		a=a+b;  10+20=30
//		b=a-b;  30-20=10;
//		a=a-b;   30-10=20
		
		// without using 3rd variable using * and /
		
//		      a=a*b;  //10*20=200
//		      b=a/b;  //30/20=10;
//			  a=a/b;   //30/10=20
//		
			// without using 3rd variable using XOR(^)
			 // which get converted into birany to deimal value
//		10 = 1010
//	    20 = 10100
//	    
//	    10^20 = 11110
		
//		a b = XOR
//		
//		0 0 = 0
//		0 1 = 1
//		1 0 = 1
//		1 1 = 0
//			  a=a^b;  //10^20=200
//		      b=a^b;  //30^20=10;
//			  a=a^b;   //30^10=20
		
		
//		with single statement 
//		current b value 20 is stored in a so that a+b is 30 then 30 - 20  = 10 now b is  10 the 
//				again it will continue the  same 
		b=a+b-(a=b);
		
		
		System.out.println("after swapping value of  \n"+a +"\n"+b);

	}

}
