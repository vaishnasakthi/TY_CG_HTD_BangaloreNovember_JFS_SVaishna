package com.capg.phonesimulator.home;

import java.util.Scanner;

import com.capg.phonesimulator.operation.SearchContact;

public class SearchContactHome {
public static void search() {
	Scanner sc=new Scanner(System.in);
	SearchContact.search();
	while(true) {
	System.out.println("1.Press 1 to call\n2.Press 2 to message\n3.Press 3 to go back to main menu");
	System.out.println("Enter your choice : ");
	int choice=sc.nextInt();
	switch(choice) {
	case 1: System.out.println("CALLING THE CONTACT...");
	        System.out.println("Press any e to end the call");
	        String end=sc.next();
	        if(end.equals("E") || end.equals("e"))
	        {
	        	System.err.println("CALL ENDED..");
	        }
	        else {
	        	System.out.println("ON CALL...");
	        }
		break;
	case 2: System.out.println("Enter the message : ");
	String msg=sc.next();
	System.out.println("SENDING MESSAGE...");
		break;
	case 3: HomeMain.home();
		break;
	default:
		System.out.println("Invalid Option!!!");
	}
}
}
}
