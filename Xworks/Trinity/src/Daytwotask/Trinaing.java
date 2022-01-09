package Daytwotask;

import java.util.Scanner;

public class Trinaing {
//	write a program to montitor give data is belong to trinaing module
	// logical
	// bitwise
	// do while

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter training centre name  : ");
		String name = sc.next();
		System.out.print("Enter location  : ");
		String location = sc.next();
		if(name==location) {
			System.out.println("seats are available you can Enrolle");
			
		}
		else {
			System.err .println("seats are filled keep in touch we will notify you later");
			System.out.println("     stil book it now its self  ");
		}
		String press = null;
		String yes;
		do {
			System.out.print("\nchoose any option (1.java,2.sql,3.html,4.css): ");
			int enter = sc.nextInt();
			switch (enter) {
			case 1:
				System.out.println("Enrolled for java training ");
				System.out.println("Enter your name");
				String name1 = sc.next();
				System.out.println("Select the batch (A1=9am-10am,A2=11am-12pm,A3=2pm-3pm,A3=4pm-5pm");
				String batch = sc.next();
				System.out.println(" ");
				System.out.println("core java 20000k for 3 month");
				int fees = 0;
				String course = null;
				if (name!=batch) {
					System.out.println("Enrolled succesfully");
				} else {
					System.err.println("failed Enrolled");
				}

				break;
			case 2:
				System.out.println("Enrolled for sql training ");
				
				System.out.println("Enter your name");
				String name2 = sc.next();
				System.out.println("Select the batch (A1=9am-10am,A2=11am-12pm,A3=2pm-3pm,A3=4pm-5pm");
				String batch1 = sc.next();
				System.out.println("fees paid");
				int fee =sc.nextInt();
				System.out.println("due fee ");
				int due =sc.nextInt();
				System.out.println(" ");
				System.out.println("sql 5000 for 1 month");
				
				if (fee==5000 & due==2000) {
					System.out.println("Enrolled succesfully");
				} else {
					System.err.println("failed Enrolled");
				}

				break;
			case 3:
				System.out.println("Enrolled for html training ");
				
				System.out.println("Enter your name");
				String name3 = sc.next();
				System.out.println("Select the batch (A1=9am-10am,A2=11am-12pm,A3=2pm-3pm,A3=4pm-5pm");
				String batch2 = sc.next();
				System.out.println("fees paid");
				int fee1 =sc.nextInt();
				System.out.println("due fee ");
				int due1 =sc.nextInt();
				System.out.println(" ");
				System.out.println("sql 5000 for 1 month");
				
				if (fee1==5000 & due1==2000) {
					System.out.println("Enrolled succesfully");
				} else {
					System.err.println("failed Enrolled");
				}

				break;
			case 4:
				System.out.println("Enrolled for css training ");
				
				System.out.println("Enter your name");
				String name4 = sc.next();
				System.out.println("Select the batch (A1=9am-10am,A2=11am-12pm,A3=2pm-3pm,A3=4pm-5pm");
				String batch3 = sc.next();
				System.out.println("fees paid");
				int fee2 =sc.nextInt();
				System.out.println("due fee ");
				int due2 =sc.nextInt();
				System.out.println(" ");
				System.out.println("sql 5000 for 1 month");
				
				if (fee2==5000 | due2==2000) {
					System.out.println("Enrolled succesfully");
				} else {
					System.err.println("failed Enrolled");
				}

				break;
			default:
				System.err.printf("Error! Enter correct operator");
				return;
			}
			System.out.print("\n you want to continue press yes for next step , press no for exit:\n");
			press = sc.next();
		} while (press.equals("yes"));

	}
}
