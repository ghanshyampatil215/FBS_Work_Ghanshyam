package com.file.dsa;

import java.util.Scanner;

public class MainApp {
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		while(true) {
			
			System.out.println("\n=======Double Linked List=======");
			System.out.println("1. insert At Beginning");
			System.out.println("2. insert at End");
			System.out.println("3. Delete From Beginning");
			System.out.println("4.Display");
			System.out.println("5.exit");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:
				System.out.println("Enter data :");
				int datal = sc.nextInt();
				
				list.insertAtBeginning(datal);
				break;
				
			case 2:
				System.out.println("Enter data: ");
				int data2 = sc.nextInt();
				
				list.insertEnd(data2);
				break;
				
			case 3:
				list.deleteFromBeginning();
				break;
				
			case 4:
				list.display();
				break;
				
			case 5:
				System.out.println("Program Ended!!");
				sc.close();
				return;
				
				default:
					System.out.println("Invalid Choice");
			}
		}
	}

}
