package AdapterPatternExample;

import java.util.Scanner;

public class AdapterPatternTest {
	 public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
	        PaymentProcessor gPayProcessor = new GPayAdapter(new GPay());
	        PaymentProcessor paytmProcessor = new PaytmAdapter(new Paytm());
	        PaymentProcessor phonePeProcessor = new PhonePeAdapter(new PhonePe());

	        System.out.println("Enter amount for processing in Gpay ");
	        int g_amt=sc.nextInt();
	        
	        System.out.println("Enter amount for processing in Paytm ");
	        int pa_amt=sc.nextInt();
	   
	        System.out.println("Enter amount for processing in PhonePe ");
	        int ph_amt=sc.nextInt();
	        
	        gPayProcessor.processPayment(g_amt);
	        paytmProcessor.processPayment(pa_amt);
	        phonePeProcessor.processPayment(ph_amt);
	        sc.close();
	    }
	
}
