package com.capg.thread.creatingthread;

public class UserIrctc extends Thread{
IRCTC i;

public UserIrctc(IRCTC i) {
	super();
	this.i = i;
}
public void run() {
	i.confirmTicket();
}
}
