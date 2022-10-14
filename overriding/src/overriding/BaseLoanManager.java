package overriding;

public class BaseLoanManager {

	// public final diye yaparsak ezme yapamayız sadece buradaki method kullanılır.
	public double calculate(double amount) {
		return amount * 1.18;
	}
}
