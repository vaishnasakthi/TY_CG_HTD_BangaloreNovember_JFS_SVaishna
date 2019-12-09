package hashset;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(20);
		hs.add(26);
		hs.add(16);
		hs.add(46);
		hs.add(null);
		for(Object obj: hs) {
			System.out.println(obj);
			
		}
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Kenny");
		hs1.add("Randy");
		hs1.add("Jack");
		hs1.add("Sebastian");
		hs1.add(null);
		for(Object obj:hs1) {
			System.out.println(obj);
			
		}
		

	}

}
