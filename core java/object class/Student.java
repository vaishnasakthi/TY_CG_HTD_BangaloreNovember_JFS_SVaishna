
public class Student {
int studId;
String studName;

public Student(int studId, String studName) {
	super();
	this.studId = studId;
	this.studName = studName;
}

public String toString() {
	return "The student name is : "+studName +" and student id is : "+studId;
}
}
