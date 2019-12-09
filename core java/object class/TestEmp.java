
public class TestEmp {

	public static void main(String[] args) {
		Employee e1=new Employee("v",16);
		Employee e2=new Employee("v",16);
		Employee e3=new Employee("v",16);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}

}
