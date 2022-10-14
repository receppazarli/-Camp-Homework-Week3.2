package overriding;

public class StudentLoanManager extends BaseLoanManager {

	public double calculate(double amount) {
		return amount * 1.10;
	}
}
