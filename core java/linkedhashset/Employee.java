package linkedHashset;

public class Employee {
String ename;
int empage;
public Employee(String ename, int empage) {
	super();
	this.ename = ename;
	this.empage = empage;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empage;
	result = prime * result + ((ename == null) ? 0 : ename.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (empage != other.empage)
		return false;
	if (ename == null) {
		if (other.ename != null)
			return false;
	} else if (!ename.equals(other.ename))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", empage=" + empage + "]";
}

}
