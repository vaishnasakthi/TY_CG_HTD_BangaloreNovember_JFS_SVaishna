package throwandthrows;

public class User {

	public static void main(String[] args) {
		System.out.println("Main Started");
		Irctc i1=new Irctc();
		Paytm p=new Paytm(i1);
		p.bookTicket();
		System.out.println("Main Started");
	}

}
