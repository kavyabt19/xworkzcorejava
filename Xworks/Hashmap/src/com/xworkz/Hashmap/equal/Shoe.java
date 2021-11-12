package com.xworkz.Hashmap.equal;


public class Shoe {

	 private String brand ;
	 private int size;
	 private String colour;
	 private char gender;
	 
	 public Shoe() {
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
		 if(obj==null) {
			 System.out.println("you have passed null value");
			 return false;
		 }
		 if(obj instanceof Shoe) {
			 System.out.println("Shoe is the instanceof Shoe");
			 Shoe a= (Shoe) obj;
			 System.out.println("casted");
			 String shoe = a.getColour();
			 if(this.colour.equals(shoe)) {
				 System.out.println("colour is matched");
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	 
}
