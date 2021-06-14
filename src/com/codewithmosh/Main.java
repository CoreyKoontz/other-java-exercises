package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
//        int principal = Console.getPrincipal();
//        float annualInterest = Console.getAnnualInterest();
//        byte years = Console.getYears();
//
//        var calculator = new MortgageCalculator(principal, annualInterest, years);
//
//        var report = new MortgageReport(calculator);
//        report.printMortgage();
//        report.printPaymentSchedule();


        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(0);
        numbers.print();
    }
}
