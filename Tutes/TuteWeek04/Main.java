import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		FixedDepositAccount FD = new FixedDepositAccount(100,"Sehan", 10000.00, 10, 10000);
		SavingAccount SA = new SavingAccount(101,"Sehan02", 20000.00, 5, 2000);
		
		FD.display();
		SA.display();
		
		FD.deposite();
		SA.withdraw();
		
		FD.display();
		SA.withdraw();
		
	}
}