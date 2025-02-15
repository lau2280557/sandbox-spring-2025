package org.example.sandbox.inheritance;

public class Crow extends Bird {
    public Crow(){
        count++;
    }

    @Override
    public void fly() {
        System.out.println("I am flying like a crow");
    }


    @Override
    public void tweet() {
        System.out.println("I am tweeting like a crow");

    }
}
