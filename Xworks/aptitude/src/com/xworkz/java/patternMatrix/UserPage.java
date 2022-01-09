import java.util.Scanner;
class UserPage {
	
	public static void main(String[] args) {
		
		String name;
		String password;
		int phonenumber;
		int dob;
     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		
		name=sc.next();
		System.out.println("Enter the phonenumber");
		phonenumber=sc.nextInt();
		
		System.out.println("Enter the dob");
		dob=sc.nextInt();
		
		
			if(dob==phonenumber && phonenumber!=dob) {
				System.out.println("Successfully login");
		
				}
				else{
			System.out.println("please register before login");
			
		}
		
		
		
	}
	

}
