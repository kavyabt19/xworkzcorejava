package com.xworkz.Hashmap.equal;

public class City {

	
	 private String CountryName;
	 private String StateName;
	 private String name;
	 
	 public City() {
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
		 if(obj instanceof City ) {
			 System.out.println("City  is the instanceof City");
			 City  a= (City ) obj;
			 System.out.println("casted");
			 String City = a.getName();
			 if(this.name.equals(City )) {
				 System.out.println("Name is matched");
				 return true;
			 }
		 }
		 return false;
		 
	 }

	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}

	public String getStateName() {
		return StateName;
	}

	public void setStateName(String stateName) {
		StateName = stateName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
