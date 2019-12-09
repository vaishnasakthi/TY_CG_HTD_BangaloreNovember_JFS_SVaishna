package exception;

public class A {
	static void o() {
		try {
			B.n();
		}catch(ArithmeticException a)
		{
			System.out.println(a.getMessage());
		}
		
	}

}
