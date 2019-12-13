package com.capg.phonesimulator.home;

import java.util.Scanner;

import com.capg.phonesimulator.operation.AddContact;
import com.capg.phonesimulator.operation.DeleteContact;
import com.capg.phonesimulator.operation.EditContact;

public class Operate {
public static void op() {
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("Press 1 to add contact\nPress 2 to delete Contact\nPress 3 to edit Contact\nPress 4 to go back to Main menu");
    System.out.println("Enter your choice");
    int choice=sc.nextInt();
    switch(choice) {
    case 1:AddContact.add();
    	break;
    case 2: DeleteContact.delete();
    	break;
    case 3:EditContact.edit();
    	break;
    case 4: HomeMain.home();
    	default:
    		System.out.println("Invalid Option");
    }
	}  
}
}
