package Dayonetask;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row");
		int r=sc.nextInt();
		System.out.println("Enter the col");
		int c=sc.nextInt();
		
				StarPattern sp=new StarPattern();
			  sp.starPattern( r, c);
		   }
		     void starPattern(int r, int c){
		    	 
		    	 for(int row=1; row<=r; row++){
					    for(int col =row; col>row; col--){
					       System.out.print(" ");
					    }
					    System.out.print(" *\n");
					    
					    for(int row1=1; row1<=r; row1++){
						    for(int col =row1; col>row1; col--){
						       System.out.print(" ");
						    }
						    System.out.print(" *\n");  
						    for(int col=1; col<(row1-1)*2; col++){
						       System.out.print(" ");
						    }
						    if(row1==1){
						      System.out.print("\n");
						    }
						    else{
						      System.out.print(" *\n");
						    }
						}
		
	}

}
}
