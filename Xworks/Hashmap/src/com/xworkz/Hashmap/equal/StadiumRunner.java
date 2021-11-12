package com.xworkz.Hashmap.equal;

public class StadiumRunner {

	public static void main(String[] args) {
		Stadium stadium = new Stadium();
		Stadium stadium1 = new Stadium();
		 
		 System.out.println(stadium.toString());
		 System.out.println(stadium.hashCode());
		 
		 stadium.setCity("Banglore");
		 stadium1.setCity("Manglore");
			System.out.println(stadium.equals(stadium1));
			
			stadium.setName("Kanteevarava");
			stadium1.setName("rathanavara");
				System.out.println(stadium.equals(stadium));
	}
}
