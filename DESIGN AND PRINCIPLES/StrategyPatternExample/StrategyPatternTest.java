package StrategyPatternExample;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("Abi", "9876543210", "456", "11/24");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(14500);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("abi066@example.com", "securepassword");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(30000);

        // Pay using another Credit Card
        PaymentStrategy anotherCreditCardPayment = new CreditCardPayment("Krish", "7895467831", "789", "10/25");
        context.setPaymentStrategy(anotherCreditCardPayment);
        context.executePayment(7500);
    }
}
