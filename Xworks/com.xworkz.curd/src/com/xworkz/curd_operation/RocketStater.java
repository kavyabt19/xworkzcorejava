package com.xworkz.curd_operation;

public class RocketStater {

	public static void main(String[] args) {

		Rocket Rocket = new Rocket();
		String cname = Rocket.getlaunch_date();
		System.out.println(cname);

		Rocket.addRocket("Chandrayaan2 ");
		Rocket.addRocket("RISAT-2B");
		Rocket.addRocket("	Microsat-R");
		Rocket.addRocket("EMISAT");
		Rocket.addRocket("EC0-05 ");

		Rocket.displayRocket();
	}

}
