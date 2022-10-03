package com.kodilla.kalkulator;

public class Calculator {

    private double num1;
    private double num2;

    public Calculator (double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add () {
        return num1 + num2;
    }

    public double subtract () {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(1,2);

        System.out.println(calculator.add());
    }
}
