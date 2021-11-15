class EvenNumber{

       public static void main(String[] args){
	   
	    EvenNumber even= new EvenNumber();
		even.EvenNumberUsingForLoop();
		even.EvenNumberUsingWhileLoop();
		even.EvenNumberUsingDoLoop();
	   }
	   
	   
	   void EvenNumberUsingForLoop(){
	   
	  int num=100;
	  
	        System.out.println("Even Number Using For Loop");
	    for(int i=1;i<=num;i++){
          
		  if(i%2==0){
		  
		  System.out.println(i+"\n");
		
		
		}
		

     }

}
      void EvenNumberUsingWhileLoop(){
	   
	  int num=100;
	  int i=1;
	  
	      System.out.println("Even Number Using while Loop");
	    while(i<=num){
          
		  if(i%2==0){
		  
		  System.out.println(i+"\n");
		
		
		}
		
       i++;
     }

}

     void EvenNumberUsingDoLoop(){
	   
	  int num=100;
	  int i=1;
	  
	      System.out.println("Even Number Using Do Loop");
	    do{
          
		  if(i%2==0){
		  
		  System.out.println(i+"\n");
		
		
		}
		
       i++;
     }while(i<=num);

}

     

}