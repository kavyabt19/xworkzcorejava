package com.corejava.interviwe.javacode;

public class uniqueArray {

	public static void main(String[] args) {
		int arr[]= {1,2,2,4,4,6,5,5,5,9,7,6};
		int  n=arr.length;
		int j=0;
//	int	temp[]=new int[n]; 
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[n-1];
		for(int k=0;k<n;k++) {
			System.out.print(" "+arr[k]);
		}
	}

}
