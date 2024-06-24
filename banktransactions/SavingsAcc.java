package banktransactions;

public class SavingsAcc extends Account 
{
	private static final double INR_RATE = 0.02;
	
	public SavingsAcc(double initialBalance) 
	{
		super(initialBalance);
	}
	
	@Override
	public void deposit(double amount)
	{
		balance += amount;
		balance += balance * INR_RATE ;
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(balance >= amount)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Insufficiant balance");
		}
	}
}
