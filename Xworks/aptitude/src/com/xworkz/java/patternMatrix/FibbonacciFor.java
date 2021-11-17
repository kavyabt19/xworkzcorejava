class FibbonacciFor{
 
 public static void main(String[] args){
 
 FibbonacciFor fibb=new FibbonacciFor();
 fibb.PrintUsingForLoop();
 fibb.PrintUsingRuc(0,1);
 
 }

     void PrintUsingForLoop(){
	 
	  int sum;
	  int num1=0, num2 =1;
	  
	  System.out.print( " Using For Loop \n");
	  for(int i=0;i<=10;i++){
		  
		 
	  System.out.print( "  " +num1 + " \n  ");
	  sum= num1 + num2;
	  num1 = num2;
	  num2 = sum;
	 
	  
	  }
	 } 
	  
	  
	  void PrintUsingRuc(int num1,int num2){
		  
		
		  if(num1<=100){
		  System.out.print( "  " +num1 + " \n  ");
           int sum;
		  sum= num1+num2;
		  PrintUsingRuc(num2,sum);
		  }
	 }

}																		