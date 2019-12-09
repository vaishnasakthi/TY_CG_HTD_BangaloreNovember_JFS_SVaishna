package exception;

public class TestC {

	public static void main(String[] args) {
		System.out.println("Main method Started!!");
		int arr[]=new int[2];
		arr[0]=10;
		arr[1]=20;
		try {
			arr[2]=30;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Overflow!!");
			
		}
		System.out.println("Main method ended!!");
		
	}

}
