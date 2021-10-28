package com.xworkz.curd_operation;

public class Chocolate {

	private String name;
	private String brand = new String();// type string
	private String[] chocolate = new String[5];// type string array
	private int counter = 0;

	public Chocolate() {

		this("Cadbury");
		System.out.println("invoked default chocolate");

	}

	public Chocolate(String brand) {

		System.out.println("invoked default chocolate");// class.var.method
		this.brand = brand;

	}

	public String getBrand() {
		return brand;
	}

	public void addChocolate(String name) {

		System.out.println("invoked default addchocolate");
		System.out.println(" name ".concat(name));
		if (this.counter < 5) {

			this.chocolate[this.counter] = name;
			this.counter++;
		} else {

			System.err.println("array is full");
		}
	}

	public void displayChocolate() {

		System.out.println("invoked default displaychocolate");
		int len = chocolate.length;
		for (int i = 1; i < len; i++) {

			String name1 = this.chocolate[i];
			System.out.println(name1);
		}
	}
}
