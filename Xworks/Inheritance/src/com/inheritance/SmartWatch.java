package com.inheritance;

public class SmartWatch extends DialWatch {

	int setAlarm = 5;
	String setTimer = "10min";
	String setLight = "daylight";
	
	public static void main(String[] args) {
  
		SmartWatch sm = new SmartWatch();
		System.out.println(sm.diaplyDate);
		System.out.println(sm.diaplyDay);
		System.out.println(sm.displytime);
		System.out.println(sm.setAlarm);
		System.out.println(sm.setLight);
		System.out.println(sm.setTimer);
		
		
	}

}
