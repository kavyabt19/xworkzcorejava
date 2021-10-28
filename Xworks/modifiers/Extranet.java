package com.xworkz.access.modifiers;

public class Extranet {
	
	private  static String user;
	public void setName(String name)
	{
		Extranet.user=name;
		System.out.println(user);
	}
	
	public String getName()
	{
		return Extranet.user;
	}

}
