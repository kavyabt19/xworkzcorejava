package com.xworkz.Hashmap.equal;

public class WatchStarter {

	public static void main(String[] args) {
           
		Watch watch = new Watch();
		Watch watch2 = new Watch();
		
		System.out.println(watch.toString());
		System.out.println(watch.hashCode());
		
		watch.setBrand("apple");
		watch2.setBrand("Noise");
		System.out.println(watch.equals(watch2));
		
		WatchType Smart = null;
		watch.setType(Smart);
		WatchType Digital= null;
		watch2.setType(Digital);
		System.out.println(watch.equals(watch2));
		
		
	}

}
