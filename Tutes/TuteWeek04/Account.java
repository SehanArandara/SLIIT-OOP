import java.util.Scanner;

public abstract class Account {
	int accountNo;
	String name;
	double balance;
	
	
	public Account(int accountNo, String name, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	Scanner s1 = new Scanner(System.in);
	void deposite() {
		System.out.println("enter the deposit amount :");
		this.balance+= s1.nextDouble();
	}
	
	abstract double calculateInterest();
	
	
	void display() {
		System.out.println("Account Number :"+this.accountNo);
		System.out.println("Name :"+this.name);
		System.out.println("Balance :"+this.balance);
	}
}

