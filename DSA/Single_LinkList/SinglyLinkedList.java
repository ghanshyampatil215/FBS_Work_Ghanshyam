package com.fbs.demo;

public class SinglyLinkedList {

    Node start = null;

    // Insert At Beginning
    void insertAtBeg(int ele) {

        Node temp = new Node(ele);

        if (start == null) {
            start = temp;
            return;
        }

        // Insert first, then maintain sorted order
        temp.next = start;
        start = temp;

        // If inserted element is greater than next element,
        // sorting will be handled by swap logic
        sortAfterInsert();
    }

    // Insert At End
    void insertAtEnd(int ele) {

        Node temp = new Node(ele);

        if (start == null) {
            start = temp;
            return;
        }

        Node p = start;

        while (p.next != null) {
            p = p.next;
        }

        p.next = temp;

        sortAfterInsert();
    }

    // Insert At Position
    void insertAtPosition(int ele, int pos) {

        if (pos < 0) {
            System.out.println("Invalid Position!");
            return;
        }

        Node temp = new Node(ele);

        if (pos == 0) {
            temp.next = start;
            start = temp;

            sortAfterInsert();
            return;
        }

        Node p = start;

        for (int i = 0; i < pos - 1; i++) {

            if (p == null) {
                System.out.println("Invalid Position!");
                return;
            }

            p = p.next;
        }

        if (p == null) {
            System.out.println("Invalid Position!");
            return;
        }

        temp.next = p.next;
        p.next = temp;

        sortAfterInsert();
    }

    // Maintain Sorted Order After Insertion
    private void sortAfterInsert() {

        if (start == null || start.next == null) {
            return;
        }

        Node current = start;

        while (current != null) {

            Node nextNode = current.next;

            while (nextNode != null) {

                if (current.data > nextNode.data) {

                    int temp = current.data;
                    current.data = nextNode.data;
                    nextNode.data = temp;
                }

                nextNode = nextNode.next;
            }

            current = current.next;
        }
    }

    // Delete From Beginning
    void deleteFromBeg() {

        if (start == null) {
            System.out.println("Linked List is Empty!");
            return;
        }

        start = start.next;

        System.out.println("Data deleted from beginning!");
    }

    // Delete From End
    void deleteFromEnd() {

        if (start == null) {
            System.out.println("Linked List is Empty!");
            return;
        }

        if (start.next == null) {
            start = null;

            System.out.println("Data deleted from end!");
            return;
        }

        Node p = start;

        while (p.next.next != null) {
            p = p.next;
        }

        p.next = null;

        System.out.println("Data deleted from end!");
    }

    // Display
    void display() {

        if (start == null) {
            System.out.println("Linked List is Empty!");
            return;
        }

        Node p = start;

        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }

        System.out.println("null");
    }

    // Display Reverse
    void displayReverse(Node p) {

        if (p == null) {
            return;
        }

        displayReverse(p.next);

        System.out.print(p.data + " -> ");
    }
}