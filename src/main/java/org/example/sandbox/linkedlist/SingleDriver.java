package org.example.sandbox.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("first");
        System.out.println(linkedList);

        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");
        linkedList.addLast("sixth");
        linkedList.addLast("seventh");
        linkedList.addLast("eighth");

        System.out.println(linkedList);

    }
}
