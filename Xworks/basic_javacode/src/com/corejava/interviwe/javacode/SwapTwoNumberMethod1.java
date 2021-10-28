
 //Swapping two numbers  using third variables 

package com.corejava.interviwe.javacode;

public class SwapTwoNumberMethod1 {

	public static void main(String[] args) {
		
		int a=10,b=20,temp;
		
		System.out.println("Before swapping value of a = \n"+a +"  value \n "+b);
		
		temp=a;//0=10;so a stored in temp =10
		a=b;//b in a=20;
		b=temp;
		
		System.out.println("after swapping value of a = \n"+a +"  value \n "+b);

	}

}


