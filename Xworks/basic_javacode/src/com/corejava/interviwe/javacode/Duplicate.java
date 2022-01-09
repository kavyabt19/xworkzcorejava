package com.corejava.interviwe.javacode;

public class Duplicate {

	public static void main(String[] args) {
	
		//int num[]= {1,3,4,4,5,6,7,5 };
		String num[]= {"web","sql","java","Java"};
		int num1=num.length;
		boolean duplicate=false;
			for(int i=0;i<num.length;i++) {
				
				for(int j=i+1;j<num.length;j++) {
					
		             if(num[i]==num[j]) {
		            	 System.out.println(num[i]+" ");
						duplicate = true;
					}
					
				}
			}
				if(duplicate==false) {
					System.out.println("not duplicate");
					
				}
			}
		}
		
	


