import java.util.*;

public class SavingAccount extends FixedDepositAccount {
	Scanner s1 = new Scanner(System.in);
	
	public SavingAccount(int accountNo, String name, double balance, double interestRate, double Interest) {
		super(accountNo, name, balance, interestRate, Interest);
	}

	void withdraw() {
		System.out.println("enter amount that you want to withdraw :");
		this.balance-=s1.nextDouble();
	}
	double calcalculateInterest() {
		this.Interest = this.balance * this.interestRate/100/12.0;
		
		return this.Interest;
	}
}
