package start.finish;

public class AtmClass {

	public static void main(String[] args) {
		int providedPin=5400;
		checkPin(providedPin);
	

	}
	public static void checkPin(int providedPin)
	{
		int correctPin=5400;
		if (providedPin==correctPin) {
			System.out.println("Welcome you can withdraw money");
			
		} else {
			throw new RuntimeException("You have given wrong password");

		}
		System.out.println("money has been deducted");
	}

}
