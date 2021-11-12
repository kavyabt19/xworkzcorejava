package com.xworkz.Hashmap.equal;

public class Icecream {

	private String name;
	private IcecreamFlavour flavour;
	private IcecreamType type;
	private int price;
	
	public Icecream() {
		System.out.println("Invoked no arg constructor");
		
	}
	
	public String toString() {
		System.out.println("Invoked to string method");
		return super.toString();
	}
	public int hashcode() {
		System.out.println("Invoked  hashcode method");
		return 50;
	}
	
	public boolean equal(Object obj) {
		System.out.println("Invoked equal method");
		if(obj == null) {
			System.out.println("you have passed null value");
			return false;
		}
		if(obj instanceof Icecream) {
			System.out.println("Icecream is the instanceof Icecream ");
			Icecream a= (Icecream) obj;
			System.out.println("Casted");
			String icecream =a.getName();
			if(this.name.equals(icecream)) {
				System.out.println("name is matched");
				return true;
			}
			
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IcecreamFlavour getFlavour() {
		return flavour;
	}

	public void setFlavour(IcecreamFlavour flavour) {
		this.flavour = flavour;
	}

	public IcecreamType getType() {
		return type;
	}

	public void setType(IcecreamType type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
