class FibbonacciDo{
 
 public static void main(String[] args){
 
 FibbonacciDo fibb=new FibbonacciDo();
 fibb.PrintUsingdoWhileLoop();
 
 
 }

     void PrintUsingdoWhileLoop(){
	 
	  int sum;
	 
	  int num1=0, num2 =1;
	  
	  System.out.print( " Using do while Loop \n");
	  do{
	  System.out.print(" "+ num1 + " ");
	  sum= num1 + num2;
	  num1 = num2;
	  num2 = sum;
	  
	 
	  }while(num1<=100);
	 }

}																		