package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Setting some finals to known values to add for readability later.
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // setting an instance of scanner to the sc variable so that
        // every time sc is called we get another instance of Scanner.
        Scanner sc = new Scanner(System.in);

        // Getting user input: ------------------------------------------

        int userPrinciple = 0;
        while (true) {
            System.out.println("Principle ($1k - $1M): ");
             userPrinciple = sc.nextInt();
            if (userPrinciple >= 1000 && userPrinciple <= 1_000_000)
                break;
                System.out.println("Please enter a number between 1,000 and 1,000,000");
        }


        float userAnnualInterestRate;
        while (true) {
            System.out.println("Annual Interest Rate: ");
             userAnnualInterestRate = sc.nextFloat();
            if (userAnnualInterestRate >= 0 && userAnnualInterestRate <= 30)
                break;
            System.out.println("Please enter a number between 0 and 30");
        }

        int userPeriodInYears;
        while (true) {
            System.out.println("Period (Years): ");
            userPeriodInYears = sc.nextInt();
            if (userPeriodInYears >= 1 && userPeriodInYears <= 30)
                break;
            System.out.println("Please enter a number between 1 and 30");
        }

        // r = monthly interest rate
        float monthlyInterestRate = (userAnnualInterestRate / PERCENT) / MONTHS_IN_YEAR;

        // p = principle
        int principle = userPrinciple;

        // n = number of payments
        double n = userPeriodInYears * MONTHS_IN_YEAR;

        // Mortgage calculator:
        double mortgage = principle * ((monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), n))) / ((Math.pow((1 + monthlyInterestRate), n)) - 1));

        // formatting the result of the mortgage calculator:
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // Creating a variable to hold the new formatted currency. For readability.
        String formattedMortgage = currency.format(mortgage);

        // Printing the formatted calculator results:
        System.out.println("Mortgage: " + formattedMortgage);

    }

}
