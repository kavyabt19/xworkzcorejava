package Assessment;

import java.util.Scanner;

public class Binarynumberpattern {

	public static void main(String[] args) {

		{  
			Scanner sc= new Scanner(System.in);
			System.out.println("********************Program Start********************");
			 System.out.println("\n");
			System.out.println("Enter the rows");
			int n=sc.nextInt();   
			for (int i = 1; i <= n; i++)   
			{  
			int num;  
			if(i%2 == 0)  
			{  
			num = 0;  
			for (int j = 1; j <= n; j++)  
			{  
			System.out.print(num);  
			num = (num == 0)? 1 : 0;  
			}  
			}  
			else  
																																																																																																											{  
																																																																																																											num = 1;  
			for (int j = 1; j <= n; j++)  
			{  
			System.out.print(num);  
			num = (num == 0)? 1 : 0;  
			}  
			} 
			System.out.println();  
			}  
			}
		System.out.println(" \n");
		 System.out.println("********************Program End********************");
		 
			}   
		}

