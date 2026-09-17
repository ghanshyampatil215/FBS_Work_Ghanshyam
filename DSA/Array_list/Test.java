package com.fbs.demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MyArraylist list = new MyArraylist();

		while (true) {

			System.out.println("\n===== MyArrayList Menu =====");
			System.out.println("1. Add");
			System.out.println("2. Get");
			System.out.println("3. Display");
			System.out.println("4. Check Empty");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter data: ");
				int data = sc.nextInt();

				list.add(data);
				break;

			case 2:
				System.out.print("Enter index: ");
				int index = sc.nextInt();

				try {
					System.out.println("Data = " + list.get(index));
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Invalid index!");
				}
				break;

			case 3:
				list.display();
				break;

			case 4:
				System.out.println("Is Empty? " + list.isEmpty());
				break;

			case 5:
				System.out.println("Program Ended!");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}