package banktransactions;

public class Transaction 
{
	private final double transactionFee;
	
	public Transaction(double transactionFee)
	{
		this.transactionFee = transactionFee;
	}
	
	public final void performTransaction(Account account,double amount,boolean isDeposit)
	{
		if(isDeposit)
		{
			account.deposit(amount);
		}
		else
		{
			account.deposit(amount);
		}
		account.withdraw(amount);
		System.out.println("Transaction completed. Current balance: " + account.getBalance());
	}
	
	public double getTransactionFee()
	{
		return transactionFee;
	}
}
