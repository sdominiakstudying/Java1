package bankTransactions;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	
	private double savings = 0;
	ArrayList <Transaction> transactions = new ArrayList<Transaction>();
	
	
	public Account addTransaction (Transaction transaction)
	{
		transactions.add(transaction);
		
		if (transaction.getSender() == this)
			this.savings -= transaction.getAmount();
		else
			this.savings += transaction.getAmount();
		
		return this;
	}


	public double getSavings() {
		return savings;
	}
	
	
	public Account CreateTransfer (Account receiver, Account sender, 
			double amount, Date date)
	{
		
		transactions.add(new Transaction(date, amount, sender, receiver));
		
		if (sender == this)
			this.savings -= amount; 
		else
			this.savings += amount;
		
		return this;
	}
	
	void DoWhateverAsked (Transaction transaction)
	{
		// A logical conclusion to the demand of implementing logic.
	}
	
	public Account CheckTransactionsSince (Date date)
	{
		for (int i = 0; i < transactions.size(); i++)
		{
			if (transactions.get(i).getDate().after(date))
			{
				DoWhateverAsked(transactions.get(i));
			}
		}
			
		return this;
	}
	
	
	
	public Account CheckTransactionsFrom(Date since, Date until)
	{
		for (int i = 0; i < transactions.size(); i++)
		{
			if (transactions.get(i).getDate().after(since) && 
					transactions.get(i).getDate().before(until))
			{
				DoWhateverAsked(transactions.get(i));
			}
		}
		return this;
	}
	
	public Account UndoTransaction (Transaction transaction, Date date)
	{
		transactions.add (new Transaction(date, transaction.getAmount(),
				transaction.getSender(), transaction.getReceiver()));
		
		if (transaction.getReceiver() == this)
			this.savings -= transaction.getAmount(); 
		else
			this.savings += transaction.getAmount();
		
		
		return this;
	}
	
	
}
