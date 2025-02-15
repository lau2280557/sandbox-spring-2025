package org.example.sandbox.exceptions;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;

        System.out.println(calculator.divide(a, b));
        System.out.println(calculator.divide(3, 0));
    }

    public int divide(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero");
        }
        return result;
    }

    public float divide(float a, float b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Cannot divide by zero");
        }
        return a / b;
    } //throws in method header
}
