class New {
	 
	int time; 
	String name;
	
	 
	New(int time){
		
		
		System.out.println("invoked");
		System.out.println(time);
		
	}

static void start( )// when the static method is invoked ther is no need to create object;
{
System.out.println("begin");
}

void end(String name,int time)
{
     
	 this.name=name;
	 this.time=time;
	 this.start();
	System.out.println("end");
	System.out.println(name);
	System.out.println(time);
	
	}



public static void main(String[] args)
{
	
	
	New n1= new New(8);
	n1.end("kavya",9);
	
	n1.name="kavya";
	n1.time=9;
	System.out.println(n1.name);
	System.out.println(n1.time);
	
	
	

}

}