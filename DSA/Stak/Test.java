package com.fbs.java;

import java.util.Scanner;

public class Test {
	
	static Scanner sc = new Scanner(System.in);
	static Mystack stack;

	public static void main(String[] args) {
		System.out.println("Enter Stack Size:");
         int size = sc.nextInt();
         
         stack = new Mystack(size);
         
         while(true) {
        	 System.out.println("\n===STACK MENU===");
        	 System.out.println("1.push");
        	 System.out.println("2.pop");
        	 System.out.println("3.peek");
        	 System.out.println("4.Display");
        	 System.out.println("5. Search");
        	 System.out.println("6.GEt Top ELement");
        	 System.out.println("7.Addition");
        	 System.out.println("8. Reverse");
        	 System.out.println("9.exit");
        	 
        	 System.out.println("Enter Your Choice: ");
        	 int choice = sc.nextInt();
        	 
        	 switch(choice) {
        	 case 1:
        	 
        	 System.out.println("Enter data:");
        	 int data = sc.nextInt();
        	 
        	 stack.push(data);
        	 break;
        	 
        	 case 2:
        		 stack.pop();
        		 break;
        		 
        	 case 3:
        		 stack.peek();
        		 break;
        		 
        	 case 4:
        		 stack.display();
        		 break;
        		 
        	 case 5:
        	 System.out.println("Enter element to search:");
        	 int searchData = sc.nextInt();
        	 
        	 if(stack.search(searchData)) {
        		 System.out.println("ELement Found!!");
        	 } else {
        		 System.out.println("ELement Not Found");
        		 
        	 }
        	 break;
        	 case 6:

        		    int topElement = stack.getTopElement();

        		    if(topElement == -1) {

        		        System.out.println("stack is empty!!");

        		    } else {

        		        System.out.println("top Element = " + topElement);
        		    }

        		    break;
        	 
        	 case 7:
        		 int sum = stack.addition();;
        		 System.out.println("Addition = "+sum);
        		 break;
        		 
        	 case 8:
        		 stack.reverse();
        		 break;
        		
        	 case 9:
        		 System.out.println("Program Ended!!");
        		 sc.close();
        		 return;
        		 
        		 default:
        			 System.out.println("Invalid Choice!");
        	 }    	 
         }
	}
	
}
