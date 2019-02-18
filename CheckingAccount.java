
public class CheckingAccount extends BankAccount {
/*
	CheckingAccount(double balance, int accountNo, double fee) {
		super(balance, accountNo);
		this.fee = fee;
		// TODO Auto-generated constructor stub
	}
*/
	double fee;

	@Override
	public void calculateAndUpdateBalance() {
		// TODO Auto-generated method stub
		balance -= fee;
		
	}
	
	public void toString(double f) {
		System.out.print("The fee is :" + fee);
		toString();

	}
}
