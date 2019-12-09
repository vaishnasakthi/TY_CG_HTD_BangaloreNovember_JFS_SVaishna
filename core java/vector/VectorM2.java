import java.util.Vector;

public class VectorM2 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(200);
		v1.add(80);
		v1.add(67);
		v1.add(55);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.setSize(10);
		System.out.println(v1.size());
		System.out.println(v1);
		v1.add(500);
		System.out.println(v1);
		v1.set(7,400);
		System.out.println(v1);
		System.out.println(v1.size());

	}

}
