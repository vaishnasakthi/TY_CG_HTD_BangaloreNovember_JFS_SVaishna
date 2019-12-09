package exception;

public class ExcepA {
	void excep(int a,String b) {
		try {
		System.out.println(10/0);
		try {
		System.out.println(500/a);
		}catch(ArithmeticException e) {
			System.out.println("Dont deal with 0");
		}
		}finally {
			System.out.println("Dont deal with 0");
		}
	}
}
		
			
		
		
	

