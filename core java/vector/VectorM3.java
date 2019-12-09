import java.util.Vector;

public class VectorM3 {

	public static void main(String[] args) {
	Vector v1=new Vector();
	v1.addElement(10);
	v1.addElement(78);
	v1.addElement(95);
	v1.add(44);
	System.out.println(v1);
	v1.removeElement(new Integer(78));
	System.out.println(v1);
	v1.removeElementAt(new Integer(2));
	System.out.println(v1);
	Object i1[]=new Object[v1.size()];
	System.out.println("----copyinfo---------");
	v1.copyInto(i1);
	for(int i=0;i<i1.length;i++) {
		System.out.println(v1.get(i));
		
	}
	
	}

}
