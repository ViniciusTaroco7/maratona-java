package com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.test;

import com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        calculator.changeTwoNumbers(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}
