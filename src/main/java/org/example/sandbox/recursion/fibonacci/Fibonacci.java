package org.example.sandbox.recursion.fibonacci;

public class Fibonacci {

    //2^n is the worst-case time complexity
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //use memoization to reduce time complexity to O(n)
    public static int fibonacciMemoization(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] == 0) {
            memo[n] = fibonacciMemoization(n - 1, memo) + fibonacciMemoization(n - 2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));

        int[] memo = new int[n + 1];
        System.out.println("Fibonacci of " + n + " is " + fibonacciMemoization(n, memo));
    }
}
