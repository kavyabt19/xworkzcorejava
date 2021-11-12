package com.xworkz.Hashmap.equal;

public class Food {

	 private int price ;
	 private String qulatiy;
	 private String quantity;
	 private String name;
	 
	 public Food() {
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
			 System.out.println("Food  is the instanceof Food");
			 Food  a= (Food ) obj;
			 System.out.println("casted");
			 String Food  = a.getName();
			 if(this.name.equals(Food )) {
				 System.out.println("Name is matched");
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

	public String getQulatiy() {
		return qulatiy;
	}

	public void setQulatiy(String qulatiy) {
		this.qulatiy = qulatiy;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
