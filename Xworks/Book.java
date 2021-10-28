class Book{

     String read;
	 
	 void read(){
	 
	 System.out.println("Invoked read");
	 System.out.println(read);
	 this.open();
	 
	 
	 }
	 
	 static  void write(){
	 
	 System.out.println("Invoked write");
	 open();

	 
	 
	 }
	 static  void open(){
	 
	 System.out.println("Invoked open");

	 
	 
	 }



}