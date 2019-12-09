package exception;

public class Calculator {

	void divide(int a,int b) {
		
		System.out.println("divide started");
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Dont try to divide a number by zero!!");
		}
		System.out.println("divide ended");

		
	}
		
}
