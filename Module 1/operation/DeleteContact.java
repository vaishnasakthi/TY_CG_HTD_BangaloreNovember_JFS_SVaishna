package com.capg.phonesimulator.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DeleteContact {
public static void delete() {
	 {
	Scanner sc=new Scanner(System.in);
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	ResultSet rs=null;
	try {
		Driver driver=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver Loaded...");
		//Establish the db connection
		String dburl="jdbc:mysql://localhost:3306/ContactFile"+"?user=root&password=root";
		
		conn=DriverManager.getConnection(dburl);
		System.out.println("Connection Established...");
		
		//Issue the sql query
		String qry="Delete from Contact where name=?";
		pstmt=conn.prepareStatement(qry);
		System.out.println("Enter the name : ");
		pstmt.setString(1, sc.next());
		
		System.out.println("Query Issued...");
		int count=pstmt.executeUpdate();
		if(count>0) {
			System.out.println("Deleted Contact...");
		}else {
			System.out.println("Something Went Wrong!!!");
		}
		System.out.println("");
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}

}
}
}
