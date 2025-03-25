package com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.test;

import com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        System.out.println("Finishing calculatorTest01");
        calculator.subtractTwoNumbers();
    }
}
