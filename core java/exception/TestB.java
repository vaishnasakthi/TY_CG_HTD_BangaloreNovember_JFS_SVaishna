package exception;

public class TestB {
	void write() {
		
     String s=null;
     try {
     System.out.println("Length is"+s.length());
     }
     catch(NullPointerException e) {
    	  System.out.println("Dont deal with Null values!!");
     }
     }
	public static void main(String[] args) {
		  System.out.println("Main Started!!");
		  TestB t=new TestB();
		  t.write();
		  System.out.println("Main Ended!!");

	}

}
