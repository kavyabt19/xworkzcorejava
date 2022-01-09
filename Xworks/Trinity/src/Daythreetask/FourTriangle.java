package Daythreetask;

public class FourTriangle {
	public static void main(String[] args) {
    System.out.print(" ");
    System.out.print("********************"); 
    System.out.print("Program Started"); 
    System.out.print("********************"); 
    System.out.print(" ");
	//first half pattern  
	for(int i=1; i<=5; i++)  {  
	for(int j=1; j<=5-i+1; j++)  { 
	System.out.print("*");  
	}   
	
	for(int k=1; k<=2*i-1; k++)  {  
	System.out.print(" ");  
	}   
	for(int j=1; j<=5-i+1; j++)  {  
	System.out.print("*");  
	}   
	System.out.println(); 
	}  
	// second half pattern   
	for(int i=4; i>=1; i--)  
	{  
	for(int j=i; j<=5; j++)  
	{  
	System.out.print("*");  
	}   
	
	for(int k=1; k<=(2*i)-1; k++)  
	{  
	System.out.print(" ");  
	}   
	for(int j=i; j<=5; j++)  
	{  
	System.out.print("*");  
	}   
	System.out.println();  
	} 
	System.out.print(" ");
    System.out.print("********************"); 
    System.out.print("Program Ended"); 
    System.out.print("********************"); 
    System.out.print(" ");
	}   


}
