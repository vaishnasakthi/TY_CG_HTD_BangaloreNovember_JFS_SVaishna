
public class str1 {
public static void main(String[] args) {
	String s1=new String("Harry");
	 s1=new String("Jack");
	System.out.println(s1.hashCode());
	s1=s1.concat("Potter");
	System.out.println(s1.hashCode());
}
}
