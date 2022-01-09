package Daytwotask;

public class sidesquare {

	public static void main(String[] args) {
		
	
	int n=5;
	
	for(int i=0;i<n;i++) {           //row
		
		for(int k=0;k<n-i;k++) {
			System.out.print(" ");
		}
		for(int j=0;j<n;j++) {        //col
			System.out.print("* ");
		}
		System.out.println();
	}
}
}