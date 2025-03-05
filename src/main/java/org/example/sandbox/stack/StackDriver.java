package org.example.sandbox.stack;

public class StackDriver {
    public static void main(String[] args) {
        Stack<String> stack = new ArrayListStack<>();

        stack.push("Hello");
        stack.push("World!");

        System.out.println(stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Empty " + stack.empty());

        stack.pop();
        stack.push("Howdy");

        System.out.println(stack);
        System.out.println(stack.search("Howdy"));
    }
}
