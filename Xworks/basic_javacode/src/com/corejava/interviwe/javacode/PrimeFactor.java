package com.corejava.interviwe.javacode;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
 
		
		int n=24;
		for(int i=2;i<n;i++) {
			while(n%i==0) {
				System.out.println(i+"");
				n=n/i;
				
			}
		}
		if(n>2) {
			System.out.println(n);
		}
		
		/*int n ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		 n=sc.nextInt();
		 
		 for(int i=2;i<n;i++) {
			 while(n%i==0) {
			 System.out.println(i+"");
			 n=n/2;
			 }
			 
		 }
		 if(n>2) {
			 System.out.println(n);
		 }*/
	}

}
