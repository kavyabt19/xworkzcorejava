package Assessment;

import java.util.Scanner;

public class Diamondalp {
	
	public static void main(String[] args)   {  
		
		
		 System.out.println("********************Program Start********************");
		 System.out.println(" \n");
		
	char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };  
	int alp = 0;  
	String[] str= new String[26]; // array of strings  
	System.out.print("Enter a Character between A to Z : ");  
	Scanner reader = new Scanner(System.in);  
	try   
	{  
	char user_alphabet = reader.next("[A-Z]").charAt(0);  
	// search for letter number in the array letter  
	for (int i = 0; i < alphabet.length; i++)   
	{  
	
	if (alphabet[i] == user_alphabet)   
	{  
	alp = i;  
	break;  
	}  
	}  
	//construct diamond  
	for (int i = 0; i <= alp; i++)   
	{  
	str[i] = "";  
	//add initial spaces  
	for (int j = 0; j < 3*alp - i; j++)   
	{  
	str[i] += " ";  
	}  
	// add alphabet  
	str[i] += alphabet [i]; 
	//add space between letters  
	if (alphabet[i] != 'A')   
	{  
	for (int j = 0; j < 2 * i - 1; j++)   
	{   
	str[i] += " ";   
	}   
	// add alphabet  
	str[i] += alphabet[i];   
	}   
	// Draw the first part of the diamond   
	System.out.println(str[i]);   
	}   
	for (int i = alp - 1; i >= 0; i--)  
	{   
	System.out.println(str[i]);  
	}  
	}  
	catch (Exception e)   
	{  
	e.printStackTrace();  
	}  
	finally   
	{  
	reader.close();  
	} 
	
	 System.out.println(" \n");
	 System.out.println("********************Program End********************");
	
	}  
	
}
