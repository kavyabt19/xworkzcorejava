// parameter constructor
class KiaCar{
    
	 int cost;
	 int modelnumber;
	 String color;
	 int seat;
 
    KiaCar(int cost,int modelnumber,String color ){
	
	System.out.println(" constructor is invoked");
	
	// not use to print in default constructor
	System.out.println(cost);
	System.out.println(modelnumber);
	System.out.println(color);
	

	}
	
	KiaCar(int seat){
		
		
		this.seat=seat;
		
		System.out.println(seat);
		
		
	}
	
	void display(){
		
		System.out.println("good");
		this.Kiacaremodel();
	}
	
	static void Kiacaremodel(){
		
	System.out.println("bad");
		
		
	}



}

