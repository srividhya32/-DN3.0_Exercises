package DecoratorPatternExample;

public class DecoratorPatternTest {
    public static void main(String[] args) {
     
        Notifier emailNotifier = new EmailNotifier();
        
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        
        slackNotifier.send("Hello, this is a test notification!");
        System.out.println();
        
        Notifier smsOnlyNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsOnlyNotifier.send("This is an email and SMS notification!");
        System.out.println();
        
        Notifier slackOnlyNotifier = new SlackNotifierDecorator(new EmailNotifier());
        slackOnlyNotifier.send("This is an email and Slack notification!");
    }
}

