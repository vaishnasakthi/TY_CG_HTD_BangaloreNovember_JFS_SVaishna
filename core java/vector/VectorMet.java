import java.util.Vector;

public class VectorMet {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(23);
		v1.add(56);
		v1.add(89);
		v1.add(77);
		System.out.println(v1);
		
		v1.remove(new Integer(56));
		System.out.println(v1);
		v1.set(1,1);
		System.out.println(v1);
		System.out.println("------for loop--------");
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
			
		}
	}

}
