package com.xworkz.access.modifiers;

public class WrapperTester {

	
	public static void main(String[] args) {
	
//int 
		
		int gymtools = 90;
		Integer time= 90;
		Integer gym = new Integer(time);
		
		System.out.println("*****************Begining of Integer*********** ");
		
		System.out.println(gym.equals(time));
		System.out.println(gym.toString(gymtools));
		System.out.println(gym.compareTo(gymtools));
		System.out.println(gym.valueOf(gymtools));
		System.out.println(gym.shortValue());
		
		System.out.println("***************End of Integer************ ");
		
//byte		
		byte price=90;
		Byte length = 40;
		Byte pc =new Byte(price);
		
		System.out.println();
        System.out.println("*****************Begining of Byte*********** ");
		
		System.out.println(pc.equals(price));
		System.out.println(pc.toString(price));
		System.out.println(pc.compareTo(length));
		System.out.println(pc.valueOf(price));
		System.out.println(pc.shortValue());
		
		System.out.println("***************End of Byte************ ");
		
//short
		

		short bookprice=61;
		Short bookcost=50;
		Short book=new Short(bookprice);
		book.compare(bookprice,bookcost );
		
		System.out.println();
        System.out.println("*****************Begining of short*********** ");
		
		System.out.println(book.equals(bookprice));
		System.out.println(book.toString(bookprice));
		System.out.println(book.compareTo(bookcost));
		System.out.println(book.valueOf(book));
		System.out.println(book.shortValue());
		
		System.out.println("***************End of short************ ");
		
//float
		
		float weather = 56.0f;
		Float cloudy =18.0f;
		Float climate = new Float(weather );
		
		System.out.println();
        System.out.println("*****************Begining of float*********** ");
		
		System.out.println(climate .equals(weather));
		System.out.println(climate .toString(weather));
		System.out.println(climate .compareTo(cloudy));
		System.out.println(climate .valueOf(cloudy));
		System.out.println(climate .shortValue());
		
		System.out.println("***************End of float************ ");
		
		
		
//long
		
		long iphone = 5000000;
		Long ipod = (long)580000;
		Long apple= new Long(iphone);
		
		System.out.println();
        System.out.println("*****************Begining of long*********** ");
		
		System.out.println(apple.equals(iphone));
		System.out.println(apple.toString(iphone));
		System.out.println(apple.compareTo(ipod));
		System.out.println(apple.valueOf(apple));
		System.out.println(apple.shortValue());
		
		System.out.println("***************End of long************ ");
		
//double
		
		double marks = 100.00d;
		Double percentage = 10.0d;
		Double cgpa=new Double(marks);
		
		System.out.println();
        System.out.println("*****************Begining of double*********** ");
		
		System.out.println(cgpa.equals(marks));
		System.out.println(cgpa.toString(percentage ));
		System.out.println(cgpa.compareTo(percentage ));
		System.out.println(cgpa.valueOf(marks));
		System.out.println(cgpa.shortValue());
		
		System.out.println("***************End of double************ ");
		
//boolean
		
		boolean laptop ;
		Boolean off= true;
		Boolean bi = new Boolean(off);
		
		
		System.out.println();
        System.out.println("*****************Begining of boolean*********** ");
		
		System.out.println(bi.equals(bi));
		System.out.println(bi.toString( off));
		System.out.println(bi.compareTo(off));
		System.out.println(bi.valueOf(off));
		System.out.println(bi.booleanValue());
		
		System.out.println("***************End of boolean************ ");
		
//char
		
		char[] icon = {'a','e','i'};
		Character[] iconq ={'k','a','v','y','a'};
		Character ic= new Character('e');
		
		System.out.println();
        System.out.println("*****************Begining of char*********** ");
		
		System.out.println(ic.equals(icon));
		System.out.println(ic.toString( ic));
		System.out.println(ic.compareTo(ic));
		System.out.println(ic.valueOf(ic));
		System.out.println(ic.charValue());
		
		System.out.println("***************End of char************ ");
		
		
		
		/*note: 1. compareTo(var_name) -----> fetch (0) for same value
		 *                                    fetch (1) for lesser value
		 *                                    fetch (-1) for greater value
		 *                                    fetch difference of value only to byte  */
		       
		 
		
	}

}



