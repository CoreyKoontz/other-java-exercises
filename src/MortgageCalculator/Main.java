package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner sc = new Scanner(System.in);


        System.out.println("Principle: ");
        int userPrinciple = sc.nextInt();

        System.out.println("Annual Interest Rate: ");
        float userAnnualInterestRate = sc.nextFloat();

        System.out.println("Period (Years): ");
        int userPeriodInYears = sc.nextInt();


        // r = monthly interest rate
        float r = (userAnnualInterestRate / 100) / 12;

        // p = principle
        int p = userPrinciple;

        // n = number of payments
        double n = userPeriodInYears * 12;

        // Mortgage calculator:
        double mortgage = p * ((r * (Math.pow((1 + r), n))) / ((Math.pow((1 + r), n)) - 1));

        // formatting the result of the mortgage calculator:
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // Printing the formatted calculator results:
        System.out.println("Mortgage: " + currency.format(mortgage));

    }

}
