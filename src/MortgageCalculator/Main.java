package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Setting some finals to known values to add for readability later.
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int userPrinciple = 0;
        float userAnnualInterestRate;
        int userPeriodInYears;

        // Getting user input: ------------------------------------------

        userPrinciple = (int) readNumber("Principal: ", 1_000, 1_000_000);

        userAnnualInterestRate = (float) readNumber("Annual Interest Rate: ", 1, 30);

        userPeriodInYears = (int) readNumber("Period (Years): ", 1, 30);

        float monthlyInterestRate = (userAnnualInterestRate / PERCENT) / MONTHS_IN_YEAR;  // r = monthly interest rate

        int principle = userPrinciple;  // p = principle

        double n = userPeriodInYears * MONTHS_IN_YEAR; // n = number of payments

        // Mortgage calculator:
        double mortgage = principle * ((monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), n))) / ((Math.pow((1 + monthlyInterestRate), n)) - 1));

        NumberFormat currency = NumberFormat.getCurrencyInstance();// formatting the result of the mortgage calculator:

        // Creating a variable to hold the new formatted currency. For readability.
        String formattedMortgage = currency.format(mortgage);

        // Printing the formatted calculator results:
        System.out.println("Mortgage: " + formattedMortgage);

    }

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

}
