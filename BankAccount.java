
public abstract class BankAccount {

	double balance;
	int accountNo;
	static int numAccounts;
	
	BankAccount() {
		//this.balance = balance;
		//this.accountNo = accountNo;
		numAccounts = 0;
		numAccounts ++;
	}
	
	public double getBalance() {
		return balance;
		
	}
	
	public void toString(double b) {
		System.out.print("The Balance is :" + balance);

	}

	public abstract void calculateAndUpdateBalance();
	
	
	
	
}
