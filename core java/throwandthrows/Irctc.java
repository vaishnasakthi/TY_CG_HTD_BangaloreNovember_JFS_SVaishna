package throwandthrows;

public class Irctc {
	void confirmTicket() throws ClassNotFoundException {
		try {
			
			Class.forName("throwandthrows.Paytm");
			System.out.println("Ticket is confirmed!!");
		}catch(ClassNotFoundException e) {
			
			System.out.println("Ticket is not confirmed!!");
			throw e;
		}
	}
		

}
