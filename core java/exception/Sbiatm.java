package exception;

public class Sbiatm {

	public static void main(String[] args) {
		System.out.println("Main Method strated!!");
		ATMSimulator a=new ATMSimulator();
		a.withdraw(50000);
		
		System.out.println("Main Method Ended!!");
	}

}
