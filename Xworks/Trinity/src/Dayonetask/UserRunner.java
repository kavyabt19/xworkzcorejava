package Dayonetask;

import java.util.Scanner;

public class UserRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" please choose the below option  \n login \n register");
		System.out.println("enter your choise");
		String enter = sc.next();
		String login = null;
		if (enter == login) {
			System.out.println(" login page");
		} else if(enter != login){
			System.out.println(" register before login ");
		}

		UserLogin userLogin = new UserLogin();
		while (enter == login) {
			System.out.println("Enter the phonenumber");
			int phonenumber = sc.nextInt();
			System.out.println("Enter the dob");
			int dob = sc.nextInt();
		}

		UserReg userReg = new UserReg();
		String register = null;
		while (enter == register) {
         System.out.print(" Enter the name  ");
			String name = sc.next();
			System.out.print(" Enter the phonenumber  ");
			int phonenumber = sc.nextInt();
			System.out.print(" Enter the name  ");
			int dob = sc.nextInt();
		}
	}
}
