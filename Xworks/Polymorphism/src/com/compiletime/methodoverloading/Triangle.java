package com.compiletime.methodoverloading;
public class Triangle {
	public double area(int a, int b) {
		
	return 10.5*a*b;
		
	}
	 public double area(int r) {
		
	  return 5.0*r;
	}
       public static void main(String[] args) {
		 Triangle tri=new Triangle();
    	System.out.println(tri.area(10, 5)); 
    	System.out.println(tri.area(5));
    	
    	}
}
