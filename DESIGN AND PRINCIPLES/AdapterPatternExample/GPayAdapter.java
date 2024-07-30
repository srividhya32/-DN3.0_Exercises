package AdapterPatternExample;


public class GPayAdapter implements PaymentProcessor {
    private GPay gPay;

    public GPayAdapter(GPay gPay) {
        this.gPay = gPay;
    }

    @Override
    public void processPayment(double amount) {
        gPay.sendPayment(amount);
    }
}

class PaytmAdapter implements PaymentProcessor {
    private Paytm paytm;

    public PaytmAdapter(Paytm paytm) {
        this.paytm = paytm;
    }

    @Override
    public void processPayment(double amount) {
        paytm.makePayment(amount);
    }
}

class PhonePeAdapter implements PaymentProcessor {
    private PhonePe phonePe;

    public PhonePeAdapter(PhonePe phonePe) {
        this.phonePe = phonePe;
    }

    @Override
    public void processPayment(double amount) {
        phonePe.pay(amount);
    }
}