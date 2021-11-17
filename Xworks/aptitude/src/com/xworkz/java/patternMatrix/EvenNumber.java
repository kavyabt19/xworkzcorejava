class EvenNumber{

       public static void main(String[] args){
	   
	    //  int num1=0,num2=100;
	    EvenNumber even= new EvenNumber();
		even.EvenNumberUsingForLoop();
		even.EvenNumberUsingWhileLoop();
		even.EvenNumberUsingDoLoop();
		even.EvenUsingrecursion(0,100);
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

      void EvenUsingrecursion(int num1,int num2){

              
  
        
          if (num2 < num1){
    
        return;
    }
 
  
       if(num2 % 2 == 0 )
        EvenUsingrecursion(num1, num2 - 2);
      else
        EvenUsingrecursion(num1, num2 - 1);
 
  
      if (num2 % 2 == 0)
      {
        System.out.print(num2 + "\n ");
      }
	  
}
 

}