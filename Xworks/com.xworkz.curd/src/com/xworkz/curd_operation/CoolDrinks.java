package com.xworkz.curd_operation;

public class CoolDrinks {

	private String name;
	private String brand = new String();// type string
	private String[] cooldrinks = new String[7]; // type string array
	private int counter = 0;

	public CoolDrinks() {

		this("maa");
		System.out.println("Invoked coolDrinks");

	}

	public CoolDrinks(String name) {

		System.out.println("Invoked coolDrinks");
		this.name = name;

	}

	public String getBrand() {
		return brand;
	}

	public void addCoolDrinks(String name) {

		System.out.println("Invoked addcoolDrinks name ---> \n".concat(name).concat(String.valueOf(this.counter)));

		if (this.counter < this.cooldrinks.length) {

			this.cooldrinks[this.counter++] = name;

		} else {

			System.err.println("cannot add new brand because its full");

		}

	}
	
	
	public void displaycooldrinks() {
		
		System.out.println("Invoked displaycoolDrinks");
		
		
		
	}
	
	public void deleteCoolDrinks(int mazaa) {
		
		System.out.println("Invoked deletecoolDrinks");
		if(mazaa >=0 && mazaa<this.cooldrinks.length) {
			
			this.cooldrinks[mazaa]=null;
		}
		else {
			
			System.err.println("cannot add mazaa ");
		}
		
	}
	
	public void updateCoolDrinks(int goa , String name) {
		
		if (name!=null) {
			
			if(goa<this.cooldrinks.length  && goa>=0) {
				this.cooldrinks[goa]=name;
			}
			else
			{
				System.out.println("cannot update goa");
			}
		}
		else {
			System.out.println("cannot update because update name is null");
		}
	}
	
	
}
