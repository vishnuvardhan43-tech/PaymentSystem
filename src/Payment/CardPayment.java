package Payment;

public class CardPayment extends Pay {
	
	public void pay(double amount)
	{
		System.out.println("Card Payment is Successfull...");
		System.out.println("Amount Paid: "+amount);
	}

}
