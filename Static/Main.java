package Static;

public class Main {
	public static void main(String [] args) {
		SavingAccount.setInterestRate(0.002);
		SavingAccount acc1 = new SavingAccount("김일", 1000000);
		SavingAccount acc2 = new SavingAccount("김이", 2000000);
		SavingAccount acc3 = new SavingAccount("김삼", 3000000);
		acc1.earnInterest();
		acc2.earnInterest();
		acc3.earnInterest();
		System.out.println(acc1.getName() + " : " + acc1.getAmount());
		System.out.println(acc2.getName() + " : " + acc1.getAmount());
		System.out.println(acc3.getName() + " : " + acc1.getAmount());
		System.out.println("----------------");
		SavingAccount.setInterestRate(0.003);
		acc1.earnInterest();
		acc2.earnInterest();
		acc3.earnInterest();
		System.out.println(acc1.getName() + " : " + acc1.getAmount());
		System.out.println(acc2.getName() + " : " + acc1.getAmount());
		System.out.println(acc3.getName() + " : " + acc1.getAmount());
		
		
	}
}
