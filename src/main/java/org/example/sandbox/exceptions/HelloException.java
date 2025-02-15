package org.example.sandbox.exceptions;

import java.util.Scanner;

public class HelloException {
    public static void main(String[] args) {

        //try-catch
        try {
            //do something
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //do something
        } catch (NullPointerException e) {
            e.printStackTrace();
            //Exception is the parent class of all exceptions
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //do something
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //finally do something
            //if it gets caught, the code will still execute
        }

        //try-catch with multiple exceptions
        try {
            //do something
        } catch (NullPointerException | ArithmeticException e) {
            e.printStackTrace();
        }

        //try-with-resources: includes a finally block that closes the resource
        try(Scanner scanner = new Scanner(System.in)) {
            //do something
        }
    }
}
