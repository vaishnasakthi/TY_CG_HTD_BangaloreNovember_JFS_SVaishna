package exception;

public class TestCalc {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("Main method started");
		c.divide(10,0);
		System.out.println("Main method ended");
	}

}
