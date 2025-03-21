package org.example.sandbox.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;
    private int size;


    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void addFirst(E element) {
        Node node = new Node(element, head);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            head = node;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        Node node = new Node(element, null);

        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public E pollFirst() {
        E element;

        if (head == null) {
            element = null;
            size = 0;
        } else {
            element = head.element;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node next = head.next;
                head.next = null;
                head = next;
            }
            size--;
        }

        return element;
    }

    @Override
    public E pollLast() {
        E element;

        if (tail == null) {
            element = null;
        } else {
            element = tail.element;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node current = head;
                Node previous = head;
                while (current.next != null) {
                    previous = current;
                    current = current.next;
                }
                tail = previous;
                tail.next = null;
            }
            size--;
        }

        return element;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {
        Node current = head;
        while(current.next != null) {
            Node next = current.next;
            current.next = null; //break links
            current = next;
        }
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean contains(E element) {

        boolean contains = false;
        Node current = head;
        while(current != null) {
            if(current.element.equals(element)) {
                contains = true;
                break;
            }
            current = current.next;
        }
        return contains;
    }

    @Override
    public int size() {
        return this.size;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");

        Node current = head;
        if(current != null){
            while(current != null){
                joiner.add(current.element.toString());
                current = current.next;
            }
        }
        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }

    private class Node {
        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
