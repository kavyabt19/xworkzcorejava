package Dayonetask;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		      int a;
		      int b;
		      int c;
		      char sign;
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Enter value a  : ");
		       a = sc.nextInt();
		       System.out.print("Enter value b  : ");
		      b = sc.nextInt();
		      System.out.print("\nEnter an operator (+, -, *, /): ");
		      sign = sc.next().charAt(0);
		      switch(sign) {
		         case '+': c = a + b;
		            break;
		         case '-': c = a - b;
		            break;
		         case '*': c = a * b;
		            break;
		         case '/': c = a * b;
		            break;
		      default: System.err.printf("Error! Enter correct operator");
		         return;
		      }
		      System.out.print("\nThe result of the given number is :\n");
		      System.out.printf(a + " " + sign + " " + b + " = " + c);
		      
		      Calculator calculator = new Calculator();   
		       calculator .deleteName(3);
			  calculator.updateName(25,50);
				
		      
		      System.out.println("\nyou want to continue press yes :");
		       boolean yes=sc.nextBoolean();
		   
		     
		       
		     
		      
		   }
	private int a =10;
	private int b =20;
	  public void deleteName(int a)
      {
       if(a>=0 )
        {
           this.a=0;     
        }
       else
       {
      	 System.out.println("Cannot add ");
       }
      }	
      public void updateName(int a,int b)
      {
      	this.a=30;
      }
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
     
		
	}


