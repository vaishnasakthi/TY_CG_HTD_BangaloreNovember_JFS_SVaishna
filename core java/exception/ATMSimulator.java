package exception;

public class ATMSimulator {
void withdraw(double amount) {
	if(amount>40000) {
		throw new DayLimit("Exceeds Day Limit");
		
	}
}
}
