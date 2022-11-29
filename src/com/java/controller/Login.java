package com.java.controller;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Register 2.Login 3.Forget Password");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		String regex = "[A-Z][a-z]*";
		switch(ch) {
		case 1:
			System.out.println("Please Register");
			System.out.println("Enter your FirstName");
			String fName = sc.next();
			if(fName != null && "prashanth".equals(fName)) {
				System.out.println("validated");
			} else {
				System.out.println("please enter a valid name");
			}
			System.out.println("Enter your email");
			String email = sc.next();
			System.out.println("Enter your password");
			String pass = sc.next();
			break;
		case 2:
			System.out.println("Please login");
			System.out.println("Enter email as username");
			String user_id = sc.next();
			System.out.println("Enter password");
			String password = sc.next();
			break;
		case 3:
			System.out.println("Forget password");
			System.out.println("please enter your old password");
			String oldpass = sc.next();
			System.out.println("change new password ");
			String newpass = sc.next();
			System.out.println("Confirm password");
			String confirmpw = sc.next();
			break;
			
		default:
			System.out.println("_____");
		}
		
		
		
//		try(Scanner sc = new Scanner(System.in)){
//			
//			System.out.println("Enter userName => ");
//			String userName = sc.nextLine();
//			
//			System.out.println("Enter password => ");
//			String password = sc.nextLine();
//			
//			if("prashanth".equals(userName) && "password".equals(password)) {
//				System.out.println("user successfully Logged In ");
//			} else {
//				System.out.println("Invalid username or password..");
//			}
//			
//		}
	}

}
