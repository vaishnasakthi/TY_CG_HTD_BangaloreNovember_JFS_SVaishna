package com.capg.thread.creatingthread;

public class ThreadMain {

	public static void main(String[] args) {
		System.out.println("Main Started!!");
		Thread2 t1=new Thread2();
		Thread t2=new Thread(t1);
		t2.start();
		
		System.out.println("Main Ended!!");

	}

}
