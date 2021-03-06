package com.xworkz.dp.dto;

public class Bracelet {
	
	
	private String colour;
    private String material; 
    private  boolean gifted;
    private float price;
    private boolean gemUsed;
    
    public Bracelet() {
    	
    	System.out.println("Bracelet with no-arg const is invoked");
    	
    	
    }

	public String getColour() {
		return colour;
	}
	
	public Bracelet(String colour, String material, boolean gifted, float price, boolean gemUsed) {
		super();
		this.colour = colour;
		this.material = material;
		this.gifted = gifted;
		this.price = price;
		this.gemUsed = gemUsed;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isGemUsed() {
		return gemUsed;
	}

	public void setGemUsed(boolean gemUsed) {
		this.gemUsed = gemUsed;
	}

	
    
    
	
		

	
	

}
