package Assessment;
import java.util.Scanner;
public class StarO {
	public static void main(String[] args)
	{
		 System.out.println("********************Program Start********************"); 
		    
		    System.out.print("\n ");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the rows");
		int n=sc.nextInt();
		//	int n=7;
				
				int space = (2*n-1), num   = 1;

				// Outer  for loop (i= row) 
				for (int i = 1; i <= n; i++) {

					// Inner for loop for space
					for (int j = 1; j <= space; j++)
						System.out.print(" ");

					// Inner for loop (k=col)
					int count = num  / 2 + 1;
					for (int k = 1; k <= num ; k++) {
						System.out.print(count);
						if (k <= num  / 2)
							count--;
						else
							count++;
					}

					// next line
					System.out.println();
					if (i <= n / 2) {

						// sp decreased by 1
						// st increased by 2
						space= space - 1;
						num  = num  + 2;
					}

					else {
						space = space+ 1;
						num = num  - 2;
					}
				}
				
				  System.out.print("\n ");
				 System.out.print("********************Program End********************"); 
				  
			}
}


		

		
		  
		
