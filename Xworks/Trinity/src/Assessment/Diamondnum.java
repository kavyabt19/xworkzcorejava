package Assessment;

import java.util.Scanner;

public class Diamondnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("********************Program Start********************");
		 System.out.println(" \n");
		System.out.println("Enter the rows");
		int n=sc.nextInt();
	//int n=5;
	for (int i = 1; i <= n; i++)   
	{  
	for (int j = 1; j < i; j++)   
	{  
	System.out.print(" ");  
	}  
	for (int k = i; k <= n; k++)   
	{   
	System.out.print(k+" ");  
	}  
	System.out.println();  
	}  
	for (int i = n-1; i >= 1; i--)   
	{  
	for (int j = 1; j < i; j++)   
	{  
	System.out.print(" ");  
	}  
	for (int k = i; k <= n; k++)  
	{  
	System.out.print(k+" ");  
	}  
	System.out.println();  
	}  
	System.out.println(" \n");
	 System.out.println("********************Program End********************");
	}  
	}  

