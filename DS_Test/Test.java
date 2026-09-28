// Write a program following operations on linked list
//1.insert in ascending
//2.display
//3.Delete Given element 
//not to apply sorting technique remember insert operation should
//be performed in such a way that the list remains sorting after every insertion
package p1;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 SinglyLinkedList list = new SinglyLinkedList();
	
		 while (true) {
			 System.out.println("\n====LINKED LIST=====");
			 
			    System.out.println("1. Insert in Ascending");
	            System.out.println("2. Display");
	            System.out.println("3. Delete Given Element");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
               
	            case 1:
	            	
	            	System.out.println("Enter data:");
	            	int data = sc.nextInt();
	            	
	            	list.insert(data);
	            	break;
	            	
	            case 2:
	            	list.display();
	            	break;
	            	
	            case 3:
	            	System.out.println("Enter element to delete:");
	            			int deleteData = sc.nextInt();
	            			    list.delete(deleteData);
	            			    
	            			    break;
	            			  
	            case 4:
	            	System.out.println("Progam Ended!");
	            	
	            	sc.close();
	            	
	            	return;
	            	
	            	default:
	            		
	            		System.out.println("Invalid Choice!");
	            	
	      }           
	   }

    }
}
