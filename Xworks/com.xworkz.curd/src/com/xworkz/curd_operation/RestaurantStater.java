package com.xworkz.curd_operation;

public class RestaurantStater {

	public static void main(String[] args) {

		Restaurant restaurant = new Restaurant();
		String cname = restaurant.getLocation();
		System.out.println(cname);

		restaurant.addRestaurant("Indian Molaga ");
		restaurant.addRestaurant(" BTM hotel");
		restaurant.addRestaurant("DINE FINE");
		restaurant.addRestaurant("Food zoon");
		restaurant.addRestaurant("dine");
		restaurant.addRestaurant("disha");
		restaurant.displayRestaurant();
	}

}
