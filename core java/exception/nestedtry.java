package exception;

public class nestedtry {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		try {
			try {
				System.out.println(arr[4]);
				
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception!!");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Overflow!!");
		}
		
		

	}

}
