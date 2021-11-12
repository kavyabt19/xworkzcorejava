package com.xworkz.Hashmap.equal;

public class ShoeRunner {

	 public static void main(String[] args) {
		 
		 Shoe shoe = new Shoe();
		 Shoe shoe1 = new Shoe();
		 
		 System.out.println(shoe.toString());
		 System.out.println(shoe.hashCode());
		 
		 shoe.setColour("black");
		 shoe.setColour("gray");
			System.out.println(shoe.equal(shoe1));
			
			shoe.setGender('M');
			 shoe.setGender('F');
				System.out.println(shoe.equal(shoe));
		
	}
}
