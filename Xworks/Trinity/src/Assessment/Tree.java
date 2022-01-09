package Assessment;


public class Tree {
	
	  public static void main(String[] args) {
		  System.out.println("*******************Program start******************");
		  System.out.println(" \n");
		 
	  int h=4,w=4;
	    int space = w*5;

	    int x = 1;

	    for(int a = 1;a <= h;a++){

	      for(int i = x;i <= w;i++){

	        for(int j = space;j >= i;j--){

	          System.out.print(" ");
	        }

	        for(int k = 1;k <= i;k++){

	          System.out.print("* ");
	        }

	        System.out.println();
	      }

	      x = x+2;
	      w = w+2;
	    }

	    for(int i = 1;i <= 3;i++){

	      for(int j = space-3;j >= 1;j--){
	        
	        System.out.print(" ");
	      }

	      for(int k= 1;k <= 3;k++){
	        System.out.print("* ");
	      }

	      System.out.println();
	    }
	    System.out.print("\n ");
	    System.out.println("********************Program End********************"); 
	   
	  }
	}


