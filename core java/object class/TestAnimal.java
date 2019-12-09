
public class TestAnimal {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Dog d1=new Dog("Magpie");
		Class c1=d1.getClass();
		Dog d2=(Dog) c1.newInstance();
		System.out.println(c1);
		System.out.println(d2.name);
		Class c2=Class.forName("Dog");
		System.out.println(c2);

	}

}
