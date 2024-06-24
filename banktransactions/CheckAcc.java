package banktransactions;

public class CheckAcc extends Account
{
	private static final double OVDR_LIMIT = 500;
	
	public CheckAcc(double initialBalance)
	{
		super(initialBalance);
	}
	
	@Override
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(balance + OVDR_LIMIT >= amount)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Overdraft Limit exceeded");
		}
	}
}

	
