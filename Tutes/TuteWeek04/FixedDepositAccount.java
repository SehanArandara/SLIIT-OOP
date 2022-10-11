
public class FixedDepositAccount extends Account {
	
	double interestRate;
	double Interest;
	
	public FixedDepositAccount(int accountNo, String name, double balance,double interestRate,double Interest ) {
		super(accountNo, name, balance);
		this.interestRate=interestRate;
		this.Interest =Interest;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getInterest() {
		return Interest;
	}
	public void setInterest(double interest) {
		Interest = interest;
	}
	double calculateInterest() {
		this.Interest = this.balance * this.interestRate/100.0;
		
		return this.Interest;
	}
}
