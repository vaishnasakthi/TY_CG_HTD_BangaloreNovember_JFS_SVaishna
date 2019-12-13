package com.capg.phonesimulator.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;


import com.mysql.jdbc.Statement;

public class TestShow {

	public static void add() {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		//load the driver
		try {
		Driver driver=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver Loaded...");
		//Establish the db connection
		String dburl="jdbc:mysql://localhost:3306/ContactFile"+"?user=root&password=root";
		
		conn=DriverManager.getConnection(dburl);
		System.out.println("Connection Established...");
		
		//Issue the sql query
		String qry="Select name from Contact";
		stmt=(Statement) conn.createStatement();
		rs=stmt.executeQuery(qry);
		System.out.println("Qury Isuued...");
		while(rs.next()) {
			System.out.println("name : "+rs.getString(1));
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

