package com.xworkz.Hashmap.equal;

public class HeadSetRunner {

	public static void main(String[] args) {

		HeadSet headset = new HeadSet();
		HeadSet headset2 = new HeadSet();
		
		System.out.println(headset.toString());
		System.out.println(headset.hashCode());
		
		headset.setBrand("Boot");
		headset2.setBrand("noise");
		System.out.println(headset.equals(headset2));
		
		HeadSetType Wireless =null;
		headset.setType(Wireless); 
		HeadSetType Earbuds = null;
		headset2.setType(Earbuds);
		System.out.println(headset.equals(headset2));
	}

}
