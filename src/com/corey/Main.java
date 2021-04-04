package com.corey;

import java.util.Locale;

// This Main class belongs to the Package package.
public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);

    }
}
