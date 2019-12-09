package com.capg.thread.creatingthread;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("Main Started!!");
		IRCTC i1=new IRCTC();
		UserIrctc u1=new UserIrctc(i1);
		
        u1.start();
        i1.leaveMe();
        
        UserIrctc u2=new UserIrctc(i1);
        i1.leaveMe();
        u2.start();
        
       
        System.out.println("Main Ended");
	}

}
