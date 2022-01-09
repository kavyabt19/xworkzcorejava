package Assessment;

import java.util.Scanner;

public class Kpattern {
	public static void main(String[] args)  
	{  
		Scanner sc=new Scanner(System.in);
		 System.out.println("********************Program Start********************");
		 System.out.println(" \n");
		System.out.println("Enter the rows");
		int n=sc.nextInt();
	for (int i = n; i >= 0; i--)  
	{  
	int alphabet = 65;  
	for (int j = 0; j <= i; j++)  
	{  
	System.out.print((char) (alphabet + j) + " ");  
	}  
	System.out.println();  
	}  
	for (int i = 0; i<= n; i++)  
	{  
	int alphabet = 65;  
	for (int j = 0; j <= i; j++)  
	{  
	System.out.print((char) (alphabet + j) + " ");  
	}  
	System.out.println();  
	}
	System.out.println(" \n");
	 System.out.println("********************Program End********************");
	}  
	}  

