package org.example.sandbox.linkedlist;

public class SingleDriver {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("first");

        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");

        linkedList.addLast("sixth");
        linkedList.addLast("seventh");

        System.out.println("Size " + linkedList.size());

        linkedList.pollFirst();
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println("Size " + linkedList.size());
    }
}
