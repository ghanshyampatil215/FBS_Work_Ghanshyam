package com.fbs.java;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Queue Size:");
		int size = sc.nextInt();
		
		MyQueue queue = new MyQueue(size);
		
		while (true) {
			System.out.println("\n======Queue Menu=====");
		    System.out.println("1. Enqueue");
		    System.out.println("2. Dequeue");
		    System.out.println("3. peek");
		    System.out.println("4. Display");
		    System.out.println("5. exit");
		    
		    System.out.println("Enter your choice:");
		    int choice = sc.nextInt();
		    
		    switch(choice) {
		    case 1:
		    	System.out.println("Enter data:");
		    	int data = sc.nextInt();
		    	
		    	queue.enqueue(data);
		    	break;
		    	
		    case 2:
		      queue.dequeue();
		      break;
		      
		    case 3:
		    	queue.peek();
		    	break;
		    
		    case 4:
		    	queue.display();
		    	break;
		    case 5:
		    	System.out.println("program Ended!");
		    	sc.close();
		    	
		    	return;
		    	
		    	default:
		    		System.out.println("invalid Choice!");
		    }
		}

	}

}
