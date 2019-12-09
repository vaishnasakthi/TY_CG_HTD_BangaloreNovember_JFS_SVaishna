
public class Person {
String personName;

public Person(String personName) {
	super();
	this.personName = personName;
}

@Override
protected void finalize() throws Throwable {
	
	super.finalize();
	System.out.println("Finalize method called");
}

}
