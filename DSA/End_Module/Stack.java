package com.file.dsa;

public class Stack {
	
	int arr[];
	int top;
	int size;
	
	public Stack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	
	//push 
	public void push(int data) {
		if(top == size -1 ) {
			System.out.println("stack Overflow");
			return;
		}
		
		arr[++top] = data;
		System.out.println(data + " inserted");
		
	}
	
	//pop 
	public void pop() {
		if(top == -1) {
			System.out.println("stack Underflow");
			return;
		}
		
		System.out.println(arr[top] + "deleted");
		top--;
	}
	
	//peek
	public void peek() {
		if(top == -1) {
			System.out.println("stack is empty");
			return;
		}
		System.out.println("Top element " + arr[top]);
	}
	//display
	public void display() {
		if(top == -1) {
			System.out.println("Stack is EMpty");
			return;
		}
		for(int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
