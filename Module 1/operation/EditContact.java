package com.capg.phonesimulator.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EditContact {

	public static void edit() {
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
			String qry="Update Contact set number=? and grp=? where name=?";
			pstmt=conn.prepareStatement(qry);
			
			System.out.println("Enter the name : ");
			pstmt.setString(3, sc.next());
			System.out.println("Enter the number : ");
			pstmt.setLong(1, Long.parseLong(sc.next()));
			System.out.println("Enter the group : ");
			pstmt.setString(2, sc.next());
			
			
			System.out.println("Query Issued...");
			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("Updated Contact...");
			}else {
				System.out.println("Something Went Wrong!!!");
			}
			System.out.println("");
			
			
			}catch(Exception e) {
				e.printStackTrace();
			}

	}

	}


