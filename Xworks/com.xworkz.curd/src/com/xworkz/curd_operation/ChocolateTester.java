package com.xworkz.curd_operation;

public class ChocolateTester {

	public static void main(String[] args) {

		Chocolate chocolate = new Chocolate();
		String cname = chocolate.getBrand();
		System.out.println(cname);

		chocolate.addChocolate("dairy milk");
		chocolate.addChocolate(" Bubbly");
		chocolate.addChocolate("oreo");
		chocolate.addChocolate("Fruit & Nut");
		chocolate.addChocolate("temptation");
		chocolate.addChocolate("milky bar");
		chocolate.displayChocolate();
	}

}
