package banktransactions;

public class Main 
{
	public static void main(String[] args)
	{
		SavingsAcc savings = new SavingsAcc(1000);
		CheckAcc check = new CheckAcc(500);
		Transaction trans = new Transaction(5.00);
		
		trans.performTransaction(savings,200,true); // deposit in savings
		trans.performTransaction(check,100,false); // Withdraw from checking
		
		System.out.println("Total accounts created: " + Bank.getTotalAccounts());
	}
}
