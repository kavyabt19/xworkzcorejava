package com.xworkz.Hashmap.equal;

public class Belt {

	 private int price ;
	 private int size;
	 private String material;
	 private char gender;
	 
	 public Belt() {
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
		 if(obj instanceof Belt ) {
			 System.out.println("Belt  is the instanceof Belt");
			 Belt  a= (Belt ) obj;
			 System.out.println("casted");
			 String Belt  = a.getMaterial();
			 if(this.material.equals(Belt )) {
				 System.out.println("material is matched");
				 return true;
			 }
		 }
		 return false;
		 
	 }

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
