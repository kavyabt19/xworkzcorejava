package com.xworkz.dp.dto;

public class IdeaInfinity {

private	String companyname = " IdeaInfinity";
	String openingtime = "10AM";
	float salary = 3.0f;

	IdeaInfinity() {

		System.out.println("IdeaInfinity default const is invoke");
	}

	IdeaInfinity(String companyname, String openingtime, float salary) {

		System.out.println("IdeaInfinity parameter const is invoke");

		
	}

	
	 void display() {
		 
		 
		 System.out.println(companyname);
			System.out.println(salary);
			System.out.println(openingtime);
	 }
	public static void main(String[] args) {

		IdeaInfinity// ideaInfinity = new IdeaInfinity();
		
		ideaInfinity=new IdeaInfinity("IdeaInfinity", "10AM", 3.0f);
		ideaInfinity.display();
	}

}
