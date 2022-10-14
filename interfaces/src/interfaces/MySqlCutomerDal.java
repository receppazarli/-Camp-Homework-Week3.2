package interfaces;

public class MySqlCutomerDal implements ICustomerDal,IRepository {

	@Override
	public void add() {
		System.out.println("Added My sql");
		
	}

}
