
public class Emp {
String eName;
int eId;
public Emp(String eName, int eId) {
	super();
	this.eName = eName;
	this.eId = eId;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + eId;
	result = prime * result + ((eName == null) ? 0 : eName.hashCode());
	return result;
}

//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Emp other = (Emp) obj;
//	if (eId != other.eId)
//		return false;
//	if (eName == null) {
//		if (other.eName != null)
//			return false;
//	} else if (!eName.equals(other.eName))
//		return false;
//	return true;
//}

}
