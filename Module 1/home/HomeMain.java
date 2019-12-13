package com.capg.phonesimulator.home;

import java.util.Scanner;

import com.capg.phonesimulator.operation.TestShow;

public class HomeMain {
public static void home() {
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("Press 1 to Show all the contacts\nPress 2 to Search for contact\nPress 3 to Operate on contact ");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1: TestShow.add();
		break;
	case 2:
		  SearchContactHome.search();
		break;
	case 3: Operate.op();
	     
		break;
	default:
		System.out.println("Invalid Option!!!");
	}
	}
}
}
