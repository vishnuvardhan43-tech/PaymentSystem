package Payment;

public class UpiPayment extends Pay {
	public void pay(double amount)
	{
		System.out.println("UPI Payment is Successfull...");
		System.out.println("Amount Paid: "+amount);
	}

}
