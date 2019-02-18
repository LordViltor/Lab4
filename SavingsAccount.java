
public class SavingsAccount extends BankAccount {

/*
	SavingsAccount(double balance, int accountNo, double interestRate) {
		super(balance, accountNo);
		this.interestRate = interestRate;
		// TODO Auto-generated constructor stub
	}
*/
	double interestRate;

	@Override
	public void calculateAndUpdateBalance() {
		// TODO Auto-generated method stub
		balance += balance * interestRate;
		
	}
	
	public void toString(double rate) {
		System.out.print("The interest rate is :" + interestRate);
		toString();

	}

}
