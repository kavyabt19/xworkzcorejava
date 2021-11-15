class Fibbonacci{
 
 public static void main(String[] args){
 
 Fibbonacci fibb=new Fibbonacci();
 fibb.PrintUsingWhileLoop();
 
 
 }

     void PrintUsingWhileLoop(){
	 
	  int sum;
	  int i=1;
	  int num1=0, num2 =1;
	  
	  System.out.print( " Using while Loop \n");
	  while(i<=10){
	  System.out.print(" "+ num1 + " ");
	  sum= num1 + num2;
	  num1 = num2;
	  num2 = sum;
	  
	  i++;
	  }
	 }

}																		