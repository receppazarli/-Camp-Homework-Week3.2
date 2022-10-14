package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
			
		/*BaseLogger[] loggers = new BaseLogger[] { new FileLooger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()  };
		
		for (BaseLogger baseLogger : loggers) {
			baseLogger.Log("Log message");
		}*/
		
		CustomerManager customerManager = new CustomerManager(new FileLooger());
		customerManager.add();
		

	}

}
