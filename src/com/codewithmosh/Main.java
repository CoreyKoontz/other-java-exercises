package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
        int principal = Console.getPrincipal();
        float annualInterest = Console.getAnnualInterest();
        byte years = Console.getYears();

        var calculator = new MortgageCalculator(principal, annualInterest, years);

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
