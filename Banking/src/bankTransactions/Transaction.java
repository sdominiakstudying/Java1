package bankTransactions;

import java.util.Date;
//import java.util.GregorianCalendar;

public class Transaction {
	
	final private Date DATE;
	final private double AMOUNT;
	final private Account RECEIVER;
	final private Account SENDER;
	
	public Transaction(Date date, double amount, Account receiver, Account sender) {
		DATE = date;
		AMOUNT = amount;
		RECEIVER = receiver;
		SENDER = sender;
	}

	
	
	public Date getDate() {
		return DATE;
	}

	public double getAmount() {
		return AMOUNT;
	}

	public Account getReceiver() {
		return RECEIVER;
	}

	public Account getSender() {
		return SENDER;
	}
	
	
	
	
	
	
	
	
}
