package com.xworkz.Hashmap.equal;

public class BeltRunner {

	 public static void main(String[] args) {
	Belt belt = new Belt();
	Belt belt1 = new Belt();
	 
	 System.out.println(belt.toString());
	 System.out.println(belt.hashCode());
	 
	 belt.setMaterial("leather");
	 belt.setMaterial("cloth");
		System.out.println(belt.equal(belt1));
		
		belt.setGender('M');
		belt.setGender('F');
			System.out.println(belt.equal(belt));
}
}