package org.example.sandbox.linkedlist;

public class SingleDriver {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("first");
        //System.out.println(linkedList);

        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");

        //System.out.println(linkedList);

        linkedList.addLast("sixth");
        linkedList.addLast("seventh");

        System.out.println(linkedList);
    }
}
