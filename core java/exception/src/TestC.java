
public class TestC {

	public static void main(String[] args) {
		System.out.println("Main started!!");
		google g=new google();
		//ola o=new ola();
		Ola o=new Ola(g);
		o.find(null);
		System.out.println("Main Ended!!");

	}

}
