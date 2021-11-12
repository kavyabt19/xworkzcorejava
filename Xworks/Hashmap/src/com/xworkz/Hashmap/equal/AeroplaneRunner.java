package com.xworkz.Hashmap.equal;

public class AeroplaneRunner {
	
	public static void main(String[] args) {
		Aeroplane aeroplane= new Aeroplane();
		Aeroplane aeroplane1 = new Aeroplane();
		 
		 System.out.println(aeroplane.toString());
		 System.out.println(aeroplane.hashCode());
		 
		 aeroplane.setCompany("IndiaGo");
		 aeroplane1.setCompany("Air India");
			System.out.println(aeroplane.equals(aeroplane1));
			
			aeroplane.setGovt("India");
			aeroplane1.setGovt("India");
				System.out.println(aeroplane.equals(aeroplane));
	}

}
