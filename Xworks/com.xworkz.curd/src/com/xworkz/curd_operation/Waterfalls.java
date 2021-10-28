package com.xworkz.curd_operation;

public class Waterfalls {

	private String Fname;
	private String place = new String();
	private String[] waterfalls = new String[5];
	private int counter;

	public Waterfalls() {

		this("Chikkamagaluru  ");
		System.out.println("Invoked default Waterfalls");

	}

	public String getPlace() {
		return place;
	}

	public Waterfalls(String place) {

		System.out.println("Invoked default Waterfalls");
		this.place=place;

	}

	public void addWaterfalls(String Fname) {

		System.out.println(" invoked addWaterfalls");
		System.out.println(" name ".concat(Fname));
		if (this.counter < 5) {

			this.waterfalls[this.counter] = Fname;
			this.counter++;

		} else {

			System.err.println("array is full");
		}
	}

	public void displayWaterfalls() {

		System.out.println("invoked displayWaterfalls");
		for (int i = 0; i < this.waterfalls.length; i++) {
			String name1 = this.waterfalls[i];
			System.out.println(name1);
		}

	}

}
