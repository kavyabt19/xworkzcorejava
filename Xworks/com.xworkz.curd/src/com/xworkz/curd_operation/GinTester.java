package com.xworkz.curd_operation;

public class GinTester {
	

		public static void main(String[] args) {

			Gin Gin = new Gin();
			String brand = Gin.getname();
			System.out.println(brand);

			Gin.addGin("Beefeater ");
			Gin.addGin("Shivanasamudra");
			Gin.addGin("The Botanist ");
			Gin.addGin("Roku");
			Gin.displayGin();
		}

	}



