package checkedException;

public class ExceptionB {

	public static void main(String[] args) {
		System.out.println("Main Started!!");
		Student s1=new Student();
		try {
			Object o1=s1.clone();
			System.out.println("Object is created!!");
		Class c1=Class.forName("checkedException.Student");
				
		

	}catch(ClassNotFoundException e) {
		System.out.println("Class not found");
	}catch(CloneNotSupportedException a) {
		System.out.println("Clone not supported");
	}
		System.out.println("Main Ended!!");

}
}
