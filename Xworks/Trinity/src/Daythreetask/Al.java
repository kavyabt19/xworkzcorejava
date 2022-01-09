package Daythreetask;

public class Al {
 
	public static void main(String args[])   
	{   
		
		 System.out.print(" ");
		    System.out.print("********************"); 
		    System.out.print("Program Started"); 
		    System.out.print("********************"); 
		    System.out.print(" ");
	//i for rows and j for columns      
	//row denotes the number of rows you want to print 
		int alp=65;
	int i, j, row=6;   
	//outer loop for rows  
	for(i=0; i<row; i++)   
	{   
	//inner loop for columns  
	for(j=0; j<=i; j++)   
	{   
	//prints stars   
	System.out.print((char)(alp +j)+" ");   
	}   
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}
	 System.out.print(" ");
	    System.out.print("********************"); 
	    System.out.print("Program End"); 
	    System.out.print("********************"); 
	    System.out.print(" ");
	}   
	}  
	





