package com.fbs.demo;

import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);
    static SinglyLinkedList list = new SinglyLinkedList();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Singly Linked List =====");
            System.out.println("1. Insert At Beginning");
            System.out.println("2. Insert At End");
            System.out.println("3. Insert At Position");
            System.out.println("4. Delete From Beginning");
            System.out.println("5. Delete From End");
            System.out.println("6. Display");
            System.out.println("7. Display Reverse");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    int ele1 = sc.nextInt();

                    list.insertAtBeg(ele1);
                    break;

                case 2:
                    System.out.print("Enter element: ");
                    int ele2 = sc.nextInt();

                    list.insertAtEnd(ele2);
                    break;

                case 3:
                    System.out.print("Enter element: ");
                    int ele3 = sc.nextInt();

                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();

                    list.insertAtPosition(ele3, pos);
                    break;

                case 4:
                    list.deleteFromBeg();
                    break;

                case 5:
                    list.deleteFromEnd();
                    break;

                case 6:
                    list.display();
                    break;

                case 7:
                    list.displayReverse(list.start);
                    System.out.println();
                    break;

                case 8:
                    System.out.println("Program Ended!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}