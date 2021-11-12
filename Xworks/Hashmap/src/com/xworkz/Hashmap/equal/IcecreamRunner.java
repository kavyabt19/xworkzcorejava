package com.xworkz.Hashmap.equal;

public class IcecreamRunner {

	public static void main(String[] args) {
		
		Icecream ice= new Icecream();
		Icecream ice2= new Icecream();
		
		System.out.println(ice.toString());
		System.out.println(ice.hashcode());
		
		ice.setName("blackberry");
		ice.setName("Butterscotch");
		System.out.println(ice.equal(ice2));
		
		IcecreamFlavour ChocolateChip =null;
		ice.equal(ChocolateChip);
		IcecreamType Cone=null;
		ice2.equals(Cone);
		System.out.println(ice.equal(ice));
		
		
	}
}
