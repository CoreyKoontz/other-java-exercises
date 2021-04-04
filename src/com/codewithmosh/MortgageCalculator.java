package com.codewithmosh;

public class MortgageCalculator {
    // ------------------------------------------------------ Fields/Properties/States:
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;

    // ------------------------------------------------------ Constructor:
    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    // ------------------------------------------------------ Methods/Behaviors:
    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();
        return principal
                * ((Math.pow((1 + monthlyInterest), numberOfPayments)) - (Math.pow((1 + monthlyInterest), numberOfPaymentsMade)))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
    }

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        return principal
                * ((monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments)))
                / ((Math.pow((1 + monthlyInterest), numberOfPayments)) - 1));
    }

    public double[] getRemainingBalances() {
       var balances = new double[getNumberOfPayments()];
        for (short i = 1; i <= years * balances.length; i++)
            balances[i - 1] = calculateBalance(i);

        return balances;
    }

    // ------------------------------------------------------ Getter Methods:
    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest() {
        return (annualInterest / PERCENT) / MONTHS_IN_YEAR;
    }
}
