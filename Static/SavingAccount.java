package Static;

public class SavingAccount {
	private String name;
	private double amount;
	private static double interestRate;
	static {
		interestRate = 0.001;
	}
	
	public SavingAccount(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public static void setInterestRate(double rate) {
		interestRate = rate;
	}
	
	public void earnInterest() {
		amount += (amount * interestRate);
	}
	
	public static void method() {
		
	}
}
