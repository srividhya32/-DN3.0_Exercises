package SingletonPatternExample;

import java.util.Scanner;

public class LoggerTest {
	  public static void main(String[] args) {
	        Scanner scanner=new Scanner(System.in);
	        Logger logger1 = Logger.getInstance();
	        Logger logger2 = Logger.getInstance();
	        
	        System.out.println("Enter log messages for logger 1 ");

	            System.out.print("logger1: ");
	            String message = scanner.nextLine();
	            logger1.log(message);
	 
	            System.out.print("logger2: ");
	            String message1 = scanner.nextLine();
	            logger2.log(message1);
	        
	        if (logger1 == logger2) {
	            System.out.println("Both logger1 and logger2 are the same instance.");
	        } else {
	            System.out.println("logger1 and logger2 are different instances.");
	        }
	        scanner.close();
	  }
}
