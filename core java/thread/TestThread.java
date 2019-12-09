package com.capg.thread.creatingthread;

public class TestThread {

	public static void main(String[] args) {
		System.out.println("Mian started");
		Thread1 t1=new Thread1();
		t1.start();
		System.out.println("Main ENded");

	}

}
