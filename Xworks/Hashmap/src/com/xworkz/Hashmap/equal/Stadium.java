package com.xworkz.Hashmap.equal;

public class Stadium {

	
	 private String city;
	 private String areaInMeters;
	 private String name;
	 
	 public Stadium () {
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
		 if(obj instanceof Stadium  ) {
			 System.out.println("Stadium   is the instanceof Stadium ");
			 Stadium  a= (Stadium ) obj;
			 System.out.println("casted");
			 String Stadium  = a.getName();
			 if(this.name.equals(Stadium)) {
				 System.out.println("Name is matched");
				 return true;
			 }
		 }
		 return false;
		 
	 }

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAreaInMeters() {
		return areaInMeters;
	}

	public void setAreaInMeters(String areaInMeters) {
		this.areaInMeters = areaInMeters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
