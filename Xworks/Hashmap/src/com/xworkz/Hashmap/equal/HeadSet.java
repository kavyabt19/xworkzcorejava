package com.xworkz.Hashmap.equal;

public class HeadSet {

	private String brand;
	private int warranty;
	private int battery;
	private HeadSetType type;

	public HeadSet() {

		System.out.println("Invoked no argument constructor");
	}

	@Override
	public String toString() {
		System.out.println("Invoked to String method");
		return super.toString();
	}

	public int hashCode() {
		System.out.println("Invoked hashCode method");
		return 2000;
	}

	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("You have passed null value");
			return false;
		}
		if (obj instanceof HeadSet) {
			System.out.println("HeadSet is  an instance of HeadSet ");
			HeadSet a = (HeadSet) obj;
			System.out.println("Casted");
			String HeadSet = a.getBrand();
			if (this.brand.equals(HeadSet)) {
				System.out.println("brand  have matched");
				return true;
			}
		}
		return false;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public HeadSetType getType() {
		return type;
	}

	public void setType(HeadSetType type) {
		this.type = type;
	}

}
