import java.util.Random;

public class BankAccountTest {

	

	public CheckingAccount[] args1;
	public SavingsAccount[] args2;
	public BankAccountTest() {
		Random r = new Random();
		
		
		args1 = new CheckingAccount[3];
		
		for(int i = 0; i < 3; i++) {
			args1[i] = new CheckingAccount();
			args1[i].accountNo = i;
			args1[i].balance = 20 + (100 - 20) * r.nextDouble();
			args1[i].fee = 1 + (5 - 1) * r.nextDouble();
		}
		
	    args2 = new SavingsAccount[2];
		for(int i = 0; i < 2; i++) {
			args2[i] = new SavingsAccount();
			args2[i].accountNo = i;
			args2[i].balance = 20 + (100 - 20) * r.nextDouble();
			args2[i].interestRate = 0.02 + (0.10 - 0.02) * r.nextDouble();
		}
	}

	
	public void monthlyProcess(BankAccount[] args) {
		
		for(int i = 0; i < BankAccount.numAccounts; i++) {
			args[i].calculateAndUpdateBalance();
		}
	}

		
	public void display(BankAccount[] args) {
			
		for(int i = 0; i < BankAccount.numAccounts; i++) {
			System.out.print("Account [" + i + "] balance is: " + args[i].getBalance());
		}
		
		
	}

	public static void main(String[] args) {
		BankAccountTest t1 = new BankAccountTest();
		t1.monthlyProcess(t1.args1);
		t1.monthlyProcess(t1.args2);
		t1.display(t1.args1);
		t1.display(t1.args2);
		
		

	}

}
