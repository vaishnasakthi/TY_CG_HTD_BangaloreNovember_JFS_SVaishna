
public class Ola {
google g1;

public Ola(google g1) {
	super();
	this.g1 = g1;
}
void find(String a) {
	try {
		g1.findloc(a);
	}catch(NullPointerException e) {
		System.out.println("Ola user Please fill locati name");
		
	}
	
}
}
