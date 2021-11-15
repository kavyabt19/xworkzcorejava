class PrimeNumber{

     public static void main(String[] args){
   
       PrimeNumber prim =new PrimeNumber();
        prim.PrimeNumberUSingForLoop();
		prim.PrimeNumberUSingWhileLoop();
		prim.PrimeNumberUSingDoLoop();
	 }
	 
	 void PrimeNumberUSingForLoop(){
		 
		 int count;
		 
		 int num;
		 
		 for(int i=1;i<=10;i++){
			 
			 count=0;
			 num=2;
			 for( i=1;num<=i/2;i++){
				 if (i % num == 0) {
             count++;
    
    }
			 }
			 if (count == 0 && i != 1) {
    System.out.print(i + " \n");
   }
  
  }
	 }
	 
	 
 void   PrimeNumberUSingWhileLoop(){
  int num;
  int n = 1;
  int Count;

  while (n <= 100) {
	  
  Count = 0;
   num = 2;
   while (num <= n / 2) {
    if (n % num == 0) {
     Count++;
    // break;
    }
   num++;
   }
   if (Count == 0 && n != 1) {
    System.out.print(n + " \n");
   }
   n++;
  }

 
}
      void   PrimeNumberUSingDoLoop() {
		  
		  int num;
		  int n=1;
		  int count;
		  
		  do{
			  count=0;
			  num=2;
			  do{
				  if(n% num ==0){
					  
					  count++;
				  }
		  num++;
	  }while(num<=n/2);
         if (count == 0 && n != 1) {
          System.out.print(n + " \n");
         }
         n++;


}while(n<=10);
	  }
}