package com.capg.phonesimulator.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class SearchContact {

	public static void search() {
		
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
			String qry="SELECT number from Contact"+
			" where name=?";
			
			pstmt=conn.prepareStatement(qry);
			System.out.println("Enter the name : ");
			pstmt.setString(1, sc.next());
			
			System.out.println("Query Issued...");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				
				
			}
			
			
			}catch(Exception e) {
				e.printStackTrace();
			}

	}

}
