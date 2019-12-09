
public class Vehicle implements Cloneable{
	String vehicleName;

	public Vehicle(String vehicleName) {
		super();
		this.vehicleName = vehicleName;
	}

	
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	

}
