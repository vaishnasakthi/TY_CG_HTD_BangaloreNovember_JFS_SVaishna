package nestedTry;

public class ExceptionC {

	public static void main(String[] args) {
	System.out.println("Main Started!!");
	Employee e1=new Employee();
	
	try {
		Object o1=e1.clone();
		System.out.println("Object is Created!!");
		try {
			Class c1=Class.forName("nestedTry.Employee");
		}catch(ClassNotFoundException a) {
			System.out.println("Clone not supported!!");
		}
	}catch(CloneNotSupportedException e) {
	
		System.out.println("Clone not supported!!");
	}
	
	
	
	System.out.println("Main Ended!!");
	
	}

}
