public class SavingsAccount extends BankAccount {
	private final double rate = 0.025;
	private static int savingsNumber = 0;
	private String accountNumber;

	public SavingsAccount(String name, double amount) {
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-" + savingsNumber);
	}

	public SavingsAccount(SavingsAccount newSvgAccount, double balance) {
		super(newSvgAccount, balance);
		savingsNumber += 1;
		this.accountNumber = newSvgAccount.accountNumber;
	}

	public void postInterest() {
		double monthlyRate = (rate / 12);
		double monthlyInterest = monthlyRate * getBalance();
		deposit(monthlyInterest);

	}

	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
}