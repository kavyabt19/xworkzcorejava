package com.xworkz.curd_operation;

public class Restaurant {

	private String name;
	private String location = new String();
	private String[] restaurant = new String[5];
	private int counter;

	public Restaurant() {

		this("BTM");
		System.out.println("Invoked default Restaurant");

	}

	public String getLocation() {
		return location;
	}

	public Restaurant(String location) {

		System.out.println("Invoked default Restaurant");
		this.location = location;

	}

	public void addRestaurant(String name) {

		System.out.println(" invoked addRestaurant");
		System.out.println(" name ".concat(name));
		if (this.counter < 5) {

			this.restaurant[this.counter] = name;
			this.counter++;

		} else {

			System.err.println("array is full");
		}
	}

	public void displayRestaurant() {

		System.out.println("invoked displayRestaurant");
		for (int i = 0; i < this.restaurant.length; i++) {
			String name1 = this.restaurant[i];
			System.out.println(name1);
		}

	}

}
