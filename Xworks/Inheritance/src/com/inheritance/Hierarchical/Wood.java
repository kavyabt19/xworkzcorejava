package com.inheritance.Hierarchical;

public class Wood {
	
	String WoodType;
	String treeName;
	int price = 50000;
	
	
	public void display() {
		
		System.out.println(" wood constructor is invoked");
	}

}





         

enum WoodType{
	
	Ash ,Balsa ,Bamboo,
	Beech ,BrazilianMahogany,
	Cedar;
	
}
