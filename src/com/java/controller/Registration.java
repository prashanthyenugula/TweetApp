package com.java.controller;

import java.util.Scanner;

public class Registration {
	
	public static void main(String[] args) {
		
		User user = new User();
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter firstName => ");
			String firstName = sc.nextLine();
			user.setFirstName(firstName);
			
			System.out.println("Enter EmaiId => ");
			String emailId = sc.nextLine();
			user.setEmailId(emailId);
			
			System.out.println("Enter Password => ");
			String password = sc.nextLine();
			user.setPassword(password);
			
			printRegisterData(user);
		}
		
	}
	
	private static void printRegisterData(User user) {
		
		System.out.println(user.getFirstName());
		System.out.println(user.getEmailId());
		System.out.println(user.getPassword());
		
	}

}
