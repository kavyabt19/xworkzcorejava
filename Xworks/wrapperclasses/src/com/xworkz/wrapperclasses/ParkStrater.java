package com.xworkz.wrapperclasses;

public class ParkStrater {

	public static void main(String[] args) {
		
        int time=9;
		Integer i = new Integer(9);
		System.out.println(i+"AM");//autoboxing
		int j;
		j=i.intValue();
		System.out.println(j+"PM"); //unboxing
		
		int feet =30;
		Integer f = new Integer(feet);
		f.byteValue();
		System.out.println(f);
		
		int gymtools = 4;
		Integer gym = new Integer(gymtools);
		gym.compareTo(f);
		System.out.println(gym);
		
		int track = 1;
		Integer tk = new Integer(1);
		tk.doubleValue();
		System.out.println(tk+" way");
		
		int chairs = 12;
		Integer chai = new Integer(chairs);
		chai.describeConstable();
		System.out.println(chairs);
		
		
		byte width=32;
		Byte b =new Byte(width);
		b.byteValue();
		System.out.println(b);
		
		byte length=24;
		Byte len =new Byte(length);
		len.equals(b);
		System.out.println(len);
		
	
		byte price=50;
		Byte pc =new Byte(price);
		pc.longValue();
		System.out.println(pc+" thousand");
		
		
		short bookprice=51;
		Short bookcost=50;
		Short book=new Short(bookprice);
		book.compare(bookprice,bookcost );
		System.out.println(book.compareTo(bookcost));
		
		short fanwings = 3;
		Short cost= 6000;
		Short cs= new Short(cost);
		cs.equals(pc);
		System.out.println(cs.equals(pc));
		
		
		short watchneedel= 3;
		Short watchcost = 1000;
		Short watch = new Short(watchcost);
		System.out.println(watch.compareUnsigned( watchcost,watchneedel));
		
		long iphone = 5000000;
		Long ipod = (long)580000;
		Long apple= new Long(iphone);
		System.out.println(apple.max(ipod, iphone));
		
		long Banglorepin = 560029;
		Long btmpin = (long)560076;
		Long pin = new Long(btmpin);
		System.out.println(pin.lowestOneBit(Banglorepin));
		
		
		long falt = 1000000;
		Long rent= (long)400000;
		Long m = new Long(rent);
		System.out.println(pin.min(falt, rent));
		
		float weather = 28.0f;
		Float cloudy =19.6f;
		Float climate = new Float(cloudy);
		System.out.println(climate.isInfinite(weather));
		
		
		float poplulation = 10.0f;
		Float genration =21.0f;
		Float human = new Float(genration);
		System.out.println(human.NEGATIVE_INFINITY);
		
		float income = 100.0f;
		Float gst =1.5f;
		Float p = new Float(gst);
		System.out.println(p.POSITIVE_INFINITY);
		
		
		double marks = 100.00d;
		Double percentage = 10.0d;
		Double cgpa=new Double(marks);
		System.out.println(cgpa.sum(marks, percentage));
		
		double cartax  = 15.000d;
		Double roadtax = 5000.00d;
		//Double tax=new Double(tax);
		//System.out.println(tax.MAX_EXPONENT);
		
		boolean laptop ;
		Boolean off= true;
		Boolean bi = new Boolean(off);
		System.out.println(bi.booleanValue());
	
		boolean booki = true ;
		Boolean bookj= false;
		Boolean bk = new Boolean(bookj);
		System.out.println(bk.equals(bk));
		
		
		
		
	}

}
