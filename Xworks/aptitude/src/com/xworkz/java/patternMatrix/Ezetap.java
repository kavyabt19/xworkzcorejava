package com.xworkz.java.patternMatrix;

public class Ezetap {

	public static void main(String[] args) {

		int arr[]= {1,1,2,2,2,4,7};
		int n =arr.length;
		int j=0;
		 for(int i=0;i<n-1;i++) {
			 if(arr[i]!=arr[i+1]) {
				 arr[j++]= arr[i];//1,2,4,
			 }
		 }
		 arr[j++]=arr[n-1];
		 for(int i=0;i<n;i++) {
			 System.out.println(arr[i]);
		 }
		 }
	}


