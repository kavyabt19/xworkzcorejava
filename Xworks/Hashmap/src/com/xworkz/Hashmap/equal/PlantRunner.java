package com.xworkz.Hashmap.equal;

public class PlantRunner {

	public static void main(String[] args) {

		Plant plant = new Plant();
		Plant plant2 = new Plant();
		
		System.out.println(plant.toString());
		System.out.println(plant.hashcode());
		
		plant.setName("Rose plant");
		plant2.setName("zz plant");
		System.out.println(plant.equals(plant));
		
		PlanType Herbs =null;
		plant.equals(Herbs);
		PlanType Shrubs =null;
		plant2.equals(Shrubs);
		System.out.println(plant2.equals(plant));
	}

}
