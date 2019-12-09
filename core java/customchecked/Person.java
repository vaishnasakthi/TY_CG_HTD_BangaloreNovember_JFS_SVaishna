package customChecked;

public class Person {

	public static void main(String[] args) throws AgeLimitException {
		System.out.println("Main Started!");
		Election e1=new Election();
		e1.vote(17);
		System.out.println("Main Ended!");
	}

}
