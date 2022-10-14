package interfaces;

public class Main {

	public static void main(String[] args) {
		// interfaceler referans tutucu görevi yapar.
		ICustomerDal customerDal = new OracleCustomerDal();

		CustomerManager customerManager = new CustomerManager(new MySqlCutomerDal());
		
		customerManager.add();
		
	}

}
