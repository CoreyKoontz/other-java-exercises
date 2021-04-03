package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }


    // ------------------------------------------------------ printMortgage method:
    public static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = mortgageCalculator(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);// formatting the result of the mortgage calculator:
        System.out.printf("MORTGAGE%n--------%nMonthly Payments: %s", mortgageFormatted);
        System.out.println(" ");
    }

    // ------------------------------------------------------ printPaymentSchedule method:
    public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.printf("%nPAYMENT SCHEDULE%n----------------%n");
        for (short i = 1; i <= years * MONTHS_IN_YEAR; i++) {
            double balance = getBalance(principal, annualInterest, years, i);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }


    // ------------------------------------------------------ readNumber method:
    public static double readNumber(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = sc.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.printf("Please enter a number between: %d and %d", min, max);
        }
        return value;
    }


    // ------------------------------------------------------ getBalance method:
    public static double getBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ) {
        float monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal
                * ((Math.pow((1 + monthlyInterest), numberOfPayments)) - (Math.pow((1 + monthlyInterest), numberOfPaymentsMade)))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);

        return balance;
    }


    // ------------------------------------------------------ mortgageCalculator method:
    public static double mortgageCalculator(
            int principal,
            float annualInterest,
            byte years
    ) {
        float monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * ((monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments)))
                / ((Math.pow((1 + monthlyInterest), numberOfPayments)) - 1));

        return mortgage;
    }

}
