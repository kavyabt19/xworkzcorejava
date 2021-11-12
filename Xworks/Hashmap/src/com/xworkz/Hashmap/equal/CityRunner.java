package com.xworkz.Hashmap.equal;

public class CityRunner {

	public static void main(String[] args) {
		City city = new City();
		City city1 = new City();
		 
		 System.out.println(city.toString());
		 System.out.println(city.hashCode());
		 
		 city.setCountryName("India");
		 city.setCountryName("usa");
			System.out.println(city.equals(city1));
			
			city.setStateName("karnataka");
			city1.setStateName("chenai");
				System.out.println(city.equals(city));
	}
}
