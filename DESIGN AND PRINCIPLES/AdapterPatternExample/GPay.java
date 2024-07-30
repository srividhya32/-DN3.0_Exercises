package AdapterPatternExample;


public class GPay {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of Rs" + amount + " through Gpay.");
    }
}

class  Paytm{
    public void makePayment(double amount) {
        System.out.println("Processing payment of Rs" + amount + " through Paytm.");
    }
}

class PhonePe {
    public void pay(double amount) {
        System.out.println("Processing payment of Rs" + amount + " through PhonePe.");
    }
}
