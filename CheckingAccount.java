public class CheckingAccount extends Account{
	
	public double overdraftLimit;
	public double balance;
	public boolean status;
	
	public CheckingAccount(AcctHolder owner, double lim) {
		super(owner,lim);
	}

	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public String getAccountType() {
		return "CHECKING";
	}
	
}
