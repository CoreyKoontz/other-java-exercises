package com.codewithmosh;

import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);

    public static double readNumber (String prompt) {
        return sc.nextDouble();
    }
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.println(prompt);
            value = sc.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.printf("Please enter a number between: %d and %d", min, max);
        }
        return value;
    }

    public static int getPrincipal() {
        return (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
    }

    public static float getAnnualInterest() {
        return (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
    }

    public static byte getYears() {
        return (byte) Console.readNumber("Period (Years): ", 1, 30);
    }
}
