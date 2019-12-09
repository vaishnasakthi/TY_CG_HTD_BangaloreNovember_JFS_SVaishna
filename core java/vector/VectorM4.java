import java.util.Vector;

public class VectorM4 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(19);
		v1.addElement(45);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.ensureCapacity(6);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.setSize(15);
		System.out.println(v1.size());
		System.out.println(v1.capacity());//doubles the capacity on invoking setSize()
		System.out.println(v1);
		

	}

}
