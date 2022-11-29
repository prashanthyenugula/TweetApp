package com.java.twitter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SendATweet {
	
	static final String DB_url = "jdbc:mysql://localhost:3306/cogdemo";
    static final String user = "root";
    static final String pass = "pass@word1";
    static final String Query = "insert into tweet (email, tweets) values(?,?)";
	
	public static void postATweet(){

	    try (Connection conn = DriverManager.getConnection(DB_url, user, pass);
	         PreparedStatement ps = conn.prepareStatement(Query)) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("post a tweet here");
	        String twt = sc.nextLine();
	        
	        ps.setString(1, LogIn.email1);
	        ps.setString(2, twt);
	        ps.execute();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
