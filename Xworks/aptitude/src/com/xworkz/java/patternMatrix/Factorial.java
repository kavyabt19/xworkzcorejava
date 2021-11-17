 class Factorial{

    public static void main(String[] args){
     
	 Factorial fact = new Factorial();
	 fact.FactorialUsingForLoop();
	fact.FactorialUsingWhileLoop();
	fact.FactorialUsingDoLoop();
	fact.FactorialUsingrecursion();
	}
	
	void FactorialUsingForLoop(){
	
        int number = 6;
        long factorial = 1;
       
	       System.out.println("Factorial Number Using For Loop");
        for (int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
	
	
	
     void FactorialUsingWhileLoop(){
	 
        int number = 6;
        long factorial = 1;
        int i=1;
         
		  System.out.println("Factorial Number Using while Loop");
        while (i <= number)
        {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

      void FactorialUsingDoLoop(){
	  
        int number = 6;
        long factorial = 1;
        int i = 1;
        
		    System.out.println("Factorial Number Using Do while Loop");
        do
        {
            factorial = factorial * i;
            i++;
        } while (i <= number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }


    
       void FactorialUsingrecursion(){
	   
        int number = 6;
        long factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
         public static long calculateFactorial(int number)
    {
        if (number == 1)
            return 1;
        else
            return number * calculateFactorial(number -1);
    }
}
