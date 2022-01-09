package com.Has_ARelationship;

public class Athletics {
	
	String Distannce;
	int meter;
	Sports name;
	String SportsTypes;
	int age;
	
	
	
	public Athletics(String string,String Distannce,int meter,String SportsTypes,
	int age) {
		
		//this.string=string;
		this.Distannce=Distannce;
		this.meter=meter;
		this.SportsTypes=SportsTypes;
		this.age=age;
		
	}
	
	void display() {
		
		System.out.println(name.first+" " +name.last+ " " +SportsTypes+" "+age+""+Distannce+ " "+ meter);
	}

}
