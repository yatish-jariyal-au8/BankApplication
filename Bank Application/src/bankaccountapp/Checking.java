package bankaccountapp;

public class Checking extends Account {
	//List properties specific to checking account.
	private long debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties.
	public Checking(String name, String sSN, double initDeposit)
	{	
		super(name, sSN, initDeposit);
		accountNumber = "2" +accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = setBaseRate() * .15;
		
	}
	
	//List any methods specific to checking account.
	public void setDebitCard()
	{
		debitCardNumber = (long)(Math.random() * Math.pow(10, 12));
		debitCardPin = (int)(Math.random() * Math.pow(10, 3));
	}
	
	
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Your Checking Account Features: " +
		"\nYour Debit Card Number: " +debitCardNumber +
		"\nYour Debit Card Pin: " +debitCardPin
				);
	}

	

}
