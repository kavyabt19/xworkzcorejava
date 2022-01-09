package Assessment;

import java.util.Scanner;

public class ReversWord {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		  System.out.println("********************Program Start********************");
			 System.out.println(" \n");
		System.out.println("      Enter the String to revers");
		String str=sc.nextLine();
//	String str="Trinity Mobility";
	String rev=" ";
	int len=str.length();
	for(int i=len-1;i>=0;i--)
	{
          rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	
	  System.out.println(" \n");
	   	 System.out.println("********************Program End********************");
}
}
