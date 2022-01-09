package Daytwotask;

public class Squarewithzero {
	public static void main(String[] args)
	    {
	             
	            for(int row=1;row<=4;row++) {	  
	            for(int col=1;col<=4;col++) {
	           if(row==1||row==4||(row==3&&col==1)||(row==2&&col==4)) {
	           
	        	   System.out.print("* ");
	           }
	        	   else if(row==2&&col==1||col==2||(row==3&&col==4)) {
	        		   System.out.print("0 ");
	        		   
	        	   }
	        	   else
	        	   {
	        		   System.out.print("  ");
	        	   }
	           }
	            System.out.println(" \n");
	            }
	    }
	

}
