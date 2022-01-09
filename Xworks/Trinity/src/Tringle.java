public class Tringle {

	
	public static void tringle(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				
				System.out.print(" *");
			}
			System.out.println();
		}
		
}
		public static void main(String[] args) {
			int n=5;
			Tringle.tringle(n);
			
	}

}


/*import java.util.Scanner;
class Hollow_Pyramid2{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the rows: ");
int rows=sc.nextInt();   
for(int i=rows; i>=1; i--){
for(int j=rows; j>i; j--){ 
System.out.print(" "); 
} 
for(int k=1; k<2*i; k++){
if(i==rows || (k==1 || k==2*i-1))
 System.out.print("*"); 
 else {
 System.out.print(" "); 
 }

}
 System.out.println(""); 
}
}
}*/

