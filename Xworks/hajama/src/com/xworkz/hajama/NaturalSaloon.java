package com.xworkz.hajama;

public class NaturalSaloon extends Saloon {
	public String name="NSNA";
	public int noOfHajamas=5;
	
	public NaturalSaloon() {
		//super();
		this("test");
		System.out.println("invoked NaturalSaloon no args const");
	}
	
	public NaturalSaloon(String name) {
		System.out.println("invoked NaturalSaloon String const");
	}

}
