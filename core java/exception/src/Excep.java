
public class Excep {
void exception(int a ,String b) {
	try {
	System.out.println(500/a);
	System.out.println(b.length());
	}catch(ArithmeticException e) {
	System.out.println("Dont deal with 0");
	}catch(NullPointerException e) {

	System.out.println("Dont deal with null values");
	}
}
}
