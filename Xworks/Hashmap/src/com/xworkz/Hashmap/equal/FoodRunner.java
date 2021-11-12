package com.xworkz.Hashmap.equal;

public class FoodRunner {
  
	public static void main(String[] args) {
		Food food = new Food();
		Food food1 = new Food();
		 
		 System.out.println(food.toString());
		 System.out.println(food.hashCode());
		 
		 food.setQulatiy("good");
		 food1.setQulatiy("bad");
			System.out.println(food.equal(food1));
			
			food.setName("pulav");
			food.setName("aulopanner");
				System.out.println(food.equal(food));
	}
}
