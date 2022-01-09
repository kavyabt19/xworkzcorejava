package com.inheritance.Hierarchical;

class Chair  extends Wood{
	
	String type="sofa";
	String colour="white";
	
   public	void display() {
		System.out.println("chair type is "+type+" "+ colour + " "+price);
	}
	
}

