package exception;

public class TestA {

	public static void main(String[] args) {
	System.out.println("Main Started!!");
	try {
		System.out.println(10/2);
	}catch(ArithmeticException a) {
		System.out.println("Dont deal with zero!!");
	}finally {
		System.out.println("Finnalyy block is executed!!");
	}
	System.out.println("Main Ended!!");

	
	}
	
}
