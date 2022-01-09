package Dayonetask;
import java.util.Scanner;
public class CountString {
	
	     public static void main(String[] args) {

			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the String");
			String str=sc.nextLine();
			
			//String str="india is my country";
		//	String str1=str.length();
			int count=1;
			for(int i=0;i<str.length()-1;i++) 
			{
				
				if((str.charAt(i)==' ') &&(str.charAt(i+1)!=' ') )
				{
					count++;
				}
			}
			System.out.println("Number of words in a given string is :"+count);
		}

	}



