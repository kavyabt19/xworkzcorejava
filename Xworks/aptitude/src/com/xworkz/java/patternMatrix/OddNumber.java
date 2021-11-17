class OddNumber{

       public static void main(String[] args){
	   
	    OddNumber odd= new OddNumber();
		odd.OddNumberUsingForLoop();
		odd.OddNumberUsingWhileLoop();
	    odd.OddNumberUsingDoLoop();
		odd.OddUsingrecursion(0,100);
	   }
	   
	   
	   void OddNumberUsingForLoop(){
	   
	  int num=100;
	  
	        System.out.println("Odd Number Using For Loop");
	    for(int i=1;i<=num;i++){
          
		  if(i%2!=0){
		  
		  System.out.println(i+"\n");
		
		
		}
		

     }

}
      void OddNumberUsingWhileLoop(){
	   
	  int num=100;
	  int i=1;
	  
	      System.out.println("Odd Number Using while Loop");
	    while(i<=num){
          
		  if(i%2!=0){
		  
		  System.out.println(i+"\n");
		
		
		}
		
       i++;
     }

}

     void OddNumberUsingDoLoop(){
	   
	  int num=100;
	  int i=1;
	  
	      System.out.println("Odd Number Using Do Loop");
	    do{
          
		  if(i%2!=0){
		  
		  System.out.println(i+"\n");
		
		
		}
		
       i++;
     }while(i<=num);
}

           void OddUsingrecursion(int num1,int num2){
  
             if (num2 < num1)
              {
                return;
               }
 
  
             if(num2 % 2 == 1 )
            OddUsingrecursion(num1, num2 - 2);
             else
            OddUsingrecursion(num1, num2 - 1);
  
  
             if (num2 % 2 == 1)
            {
           System.out.print(num2 + " \n ");
  }
}
 

}