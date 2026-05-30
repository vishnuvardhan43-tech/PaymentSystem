package Payment;

public class NetBankingPayment extends Pay {
	
	public void pay(double amount)
	{
		System.out.println("NetBanking Payment is Successfull...");
		System.out.println("Amount Paid: "+amount);
	}

}
