package polymorphismDemo;

public class FileLooger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logged to file: " + message);
	}
}
