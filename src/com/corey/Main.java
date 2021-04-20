package com.corey;

import java.util.Locale;

// This Main class belongs to the Package package.
public class Main {

    public static void main(String[] args) {
        var box1 = new TextBox();
        var box2 = new TextBox();
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());

    }
}
