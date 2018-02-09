package Unit2;

public class RE1 {

	public static void main (String[] args) {
		BankAccount bank = new BankAccount();
		bank.setBankAccount(1000, .10);
		bank.addInterest();
		System.out.println(bank.getBalance());
	}
}