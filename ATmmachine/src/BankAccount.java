
public class BankAccount {
	
	private double balance;
	
	public BankAccount(double balance) {
		this.balance=balance;
	}
	
	public void withdraw() {
		balance -= balance;
		
	}
	public void deposit() {
		balance+=balance;
	}
	public double checkbalance() {
		return balance;
	}

}
