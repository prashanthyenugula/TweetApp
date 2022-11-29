package com.java.twitter;

import java.util.Scanner;

public class TwitterUser {
	
	public static void tweetterUserMenu(Registration reg, LogIn login, ForgetPassword fp) {
		
		System.out.println("Welcome to Twitter App");
		while(true) {
			
			System.out.println("1.Register 2.Login 3.Forgot Password");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch (ch) {
		      case 1:
		    	  reg.register(); 
		        break;
		      case 2:
		        login.logIn();
		        if(login.flag==1) {
		        	TwitterUser.menuForLoggedInUser(reg,login,fp);
		        }
		        break;
		      case 3:
		        fp.forgetPassword();
		        break;
		        
		      default:
		    	    System.out.println("please choose a valid options");  
		   
			}
		}
	}
	
		public static void menuForLoggedInUser(Registration reg, LogIn login, ForgetPassword fp) {
			
		while(true) {
			System.out.println("1.Post a tweet 2.View all your tweets 3.View all tweets"
					+ " 4.View all users 5.Reset password 6.Logout");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			int ch1=sc.nextInt();
			switch (ch1) { 
		      case 1:
		    	  SendATweet.postATweet();
		        break;
		      case 2:
		    	  ViewAllYourTweets.viewAllYourTweets();
		        break;
		      case 3:
		    	  ViewAllUserTweets.viewAllUserTweets();
		        break;
		      case 4:
		    	  ViewAllUsers.viewAllUser();
			        break; 
		      case 5:
			        ResetPassword.resetPassword();
			        break;  
		      case 6:
			        System.out.println("logout successfully");
			        TwitterUser.tweetterUserMenu(reg, login, fp);
			        break;
		        
		      default:
		    	    System.out.println("please choose a valid options");  
		      
			}
			
			}
		}	
		
		public static void main(String[] args) {
		
		Registration reg = new Registration();
		LogIn login=new LogIn();
		ForgetPassword fp=new ForgetPassword();
		TwitterUser.tweetterUserMenu(reg, login, fp);
		
	}

}
