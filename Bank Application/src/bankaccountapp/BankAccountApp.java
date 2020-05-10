package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking chkacc1 = new Checking("Tom Wilson", "436798567", 1500);
	
		Savings savacc1 = new Savings("Richard Lowe", "673945782", 2500);
		
		savacc1.showInfo();
		
		System.out.println("**************************");
		
		chkacc1.showInfo();
		
		//Read a csv file and create new account based on that data.

	}

}
