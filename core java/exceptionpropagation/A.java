package exceptionPropagation;

public class A {

	public static void main(String[] args) throws ClassNotFoundException {
	System.out.println("Main Started!!");
	try {
		B.m();
	}catch(ClassNotFoundException e) {
		System.out.println("Class not found !!");
	}
	
		System.out.println("Main Ended!!");
	}

}
