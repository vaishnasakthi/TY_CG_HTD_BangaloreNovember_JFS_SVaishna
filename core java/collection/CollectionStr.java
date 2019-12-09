import java.util.ArrayList;
import java.util.Collection;

public class CollectionStr {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("Hello");
		c1.add("World");
		System.out.println(c1);
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		c1.add(12);
		System.out.println(c1.contains(12));
	}

}
