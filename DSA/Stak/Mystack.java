package com.fbs.java;

public class Mystack {

    int top ;
    int size ;
    int[] mystack;

    public Mystack(int size) {
    	this.size= size;
    	this.top=-1;
    	this.mystack= new int [size];
    }
    public boolean isEmpty() {
         if(top == -1)
        	 return true;
         else 
        	 return false;
    }
    
    public boolean isFull() {
    	if(top == size-1)
    		return true;
    	else 
    		return false;
    }
    
    public void push(int data) {
    	if(isFull()) {
    		System.out.println("stack is full");
    		return ;
    	}else {
    		mystack[++top]=data;
    	}
    	System.out.println("data insert");
    }
    
    //pop
    public void pop() {
      
    	if(isEmpty()) {
    		System.out.println("stack is empty!!");
    		return;
    	}
    		int x = mystack[top];
    		top--;
    	
    	System.out.println("x + is deleted");
    }
    public void peek() {
    	if(isEmpty()) {
    		System.out.println("Stack is empty");
    	}else {
    		System.out.println("peek element = " + mystack[top]);
    	}
    }
    
    //search
    public boolean search(int data) {
    	for(int i = top; i>=0; i--) {
    		if(mystack[i] == data) {
    			return true;
    		}
    	}
    	return false;
    }
    
    //Get Top Element
    public int getTopElement() {
    	if(isEmpty()) {
    		return -1;
    	}
    	return mystack[top];
    }
    //Addition of all elements
    public int addition() {
    	int sum = 0;
    	for(int i =0; i<= top; i++) {
    		sum = sum + mystack[i];
    	}
    	return sum;
    }
    
    //reverse stack 
    public void reverse() {
    	if(isEmpty()) {
    		System.out.println("stack is Empty");
    		return;
    	}
    	
    	int startIndex = 0;
    	int endIndex = top;
    	
    	while(startIndex < endIndex) {
    		int temp = mystack[startIndex];
    		mystack[startIndex] = mystack[endIndex];
    		mystack[endIndex] = temp;
    		
    		startIndex++;
    		endIndex--;
    	}
    	System.out.println("stack Reversed");
    	
    	}
    public void display() {
    	if(isEmpty()) {
    		System.out.println("stack is empty");
    	}else {
    		System.out.println("stack element are:");
    		for(int i=top; i>=0; i--) {
    			System.out.println(mystack[i]);
    		}
    	}
    }
}
