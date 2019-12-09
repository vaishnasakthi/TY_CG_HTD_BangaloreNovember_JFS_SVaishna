package exception;

public class  DayLimit extends RuntimeException{
	static String msg="Exceeds daylimit";

	public DayLimit() {
		super();
	}

	public DayLimit(String msg) {
		super();
		this.msg = msg;
		System.out.println("ALERT : "+this.msg);
	}
	

}
