package aap;
import java.util.Scanner;
import Payment.Pay;
import Payment.UpiPayment;
import Payment.CardPayment;
import Payment.NetBankingPayment;


public class PaymentApp {
	
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("******************** choose one *********************************");
		System.out.println("1. UPI");
		System.out.println("2. CARD");
		System.out.println("3. Net Banking");
		
		System.out.println("Enter the choice");
		int choice=s.nextInt();
		System.out.println("Enter the amount");
		double amount=s.nextDouble();
		Pay pay=null;
		switch(choice)
		{
		case 1:
			pay=new UpiPayment();
			break;
		case 2:
			pay=new CardPayment();
			break;
		case 3:
			pay=new NetBankingPayment();
			break;
		default:
			System.out.println("Invalid choice ");
			s.close();
			return;
			
			
		}
		pay.pay(amount);
		s.close();
	}

}
