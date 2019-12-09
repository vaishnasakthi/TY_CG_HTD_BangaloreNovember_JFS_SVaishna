package com.capg.thread.creatingthread;

public class IRCTC {
 synchronized void confirmTicket() {
	for(int i=0;i<4;i++) {
		System.out.println(i);
	}
	try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
//	try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}
 synchronized void leaveMe() {
		System.out.println("Notify called");
		notifyAll();
		
	}
}
