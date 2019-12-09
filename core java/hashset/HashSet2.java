package hashset;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<Student>();
		hs.add(new Student("Kenny",22));
		hs.add(new Student("Jack",24));
		hs.add(new Student("Jordan",32));
		hs.add(new Student("Kenny",22));
		
		for(Student o: hs) {
			System.out.println("Name"+o.studName);
			System.out.println("Age"+o.studAge);
			
		}
		

	}

}
