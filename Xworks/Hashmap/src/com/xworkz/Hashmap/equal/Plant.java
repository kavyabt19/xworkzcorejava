package com.xworkz.Hashmap.equal;

public class Plant {
	
	private String name;
	private String alive;
	private int lifespam;
	private PlanType type;
	
	public Plant(){
		
		System.out.println("Invoked no argument constructor");
	}
	
	public String toString() {
		
		System.out.println("Invoked to String method");
		return super.toString();
	}
	
	public int hashcode() {
		System.out.println("Invoked hashcode method");
		return 100;
	}
	
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if(obj == null) {
		System.out.println("You have passed null value");
		return false;
		}
		
		if(obj instanceof Plant) {
			System.out.println("plant is  an instance of plant ");
			Plant a=(Plant) obj;
			System.out.println("Casted");
			String plant = a.getName();
			if(this.name.equals(plant)) {
				System.out.println("name  have matched");
				return true;
			}
			
		}
		return false;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlive() {
		return alive;
	}
	public void setAlive(String alive) {
		this.alive = alive;
	}
	public int getLifespam() {
		return lifespam;
	}
	public void setLifespam(int lifespam) {
		this.lifespam = lifespam;
	}
	public PlanType getType() {
		return type;
	}
	public void setType(PlanType type) {
		this.type = type;
	}
	
	
	
	

}
