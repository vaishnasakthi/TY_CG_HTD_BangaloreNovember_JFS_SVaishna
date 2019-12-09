
public class Test {
public static void main (String[] args) {
	String s1="Harry";
	System.out.println("S1 : "+s1.hashCode());
	String s2="Phoebe";
	s1="Jack";
	String s3="Harry";
	System.out.println("S1 : "+s1.hashCode());
	System.out.println("S3 : "+s3.hashCode());
	
}
}
