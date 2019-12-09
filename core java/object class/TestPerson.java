
public class TestPerson {

	public static void main(String[] args) throws Throwable {
		System.out.println("Main method started");
		Person p=new Person("harry");
		p.finalize();
		p=null;
		System.gc();
		System.out.println("Main method ended");

	}

}
