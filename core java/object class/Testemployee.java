
public class Testemployee {

	public static void main(String[] args) {
		Employee e1=new Employee("abc",16);
		Employee e2=new Employee("xyz",46);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e2);
		Object o1=new Object();
		
	}

}
