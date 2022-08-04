
public class CheckingAccount extends BankAccount{
	private final static double FEE = .15;
	public CheckingAccount(String name, double amount) {
		super(name,amount);
		setAccountNumber(getAccountNumber()+"-10");
		
	}
	@Override
	public boolean withdraw(double amount) {
		double amountAfterFees = (amount + FEE);
		return super.withdraw(amountAfterFees);
	}

}