package FinancialForecasting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FinancialForecasting {

    private static Map<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValue(double presentValue, double growthRate, int year) {
        if (year == 0) {
            return presentValue;
        }
        if (memo.containsKey(year)) {
            return memo.get(year);
        }
        double futureValue = calculateFutureValue(presentValue * (1 + growthRate), growthRate, year - 1);
        memo.put(year, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter present value ");
        double presentValue = sc.nextDouble();
        System.out.println("Enter growth value as percentage ");
        double growthRate = sc.nextDouble()/100;
        System.out.println("Enter number of years ");
        int year = sc.nextInt();

        double futureValue = calculateFutureValue(presentValue, growthRate, year);
        System.out.printf("Future Value after %d years: %.4f%n", year, futureValue);
        sc.close();
    }
}
