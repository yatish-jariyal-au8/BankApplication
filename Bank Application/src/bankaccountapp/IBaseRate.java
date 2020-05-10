package bankaccountapp;

public interface IBaseRate {
	
	//Write a method that returns a base rate.
	default double setBaseRate()
	{
		return 2.5;
	}

}
