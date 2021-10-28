class Hotel{
    
	String name;
	String food;
	int nooftables;
	int id;
	int price;
	
	Hotel(String name,String food,int nooftables){
		
		System.out.println("parameter invoked");
		System.out.println(name);
		System.out.println(food);
		
		
		
	}
   void display(int id,int price){
	   
	   System.out.println("hotel outlet");
	   this.id=id;
	   this.price=price;
	   //this.framework();
   }
//static void framework(){
	  
	//  System.out.println("deigned in wood");
	  
 // }
}