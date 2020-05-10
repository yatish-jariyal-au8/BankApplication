package bankaccountapp;

public abstract class Account implements IBaseRate {

	//List common properties for savings and checking accounts.
	String name;
	String sSN;
	double balance;
	String accountNumber;
	double rate;
	static int index = 10000;
	
	//Constructor to set base properties and initialize.
	public Account(String name, String sSN, double initDeposit)
	{
		index++;
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		//Set account number.
		this.accountNumber = setAccountNumber();

	}
	
	private String setAccountNumber()
	{
		String lastTwoSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoSSN +uniqueID +randomNumber;
	}
	

	
	//List common methods.
	public void showInfo()
	{
		System.out.println(
				"NAME: " +name
				+"\nACCOUNT NUMBER: " +accountNumber
				+"\nBALANCE: " +balance
				);
	}
}
