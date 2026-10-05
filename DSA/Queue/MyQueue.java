package com.fbs.java;


public class MyQueue {

    int size;
    int rear, front;
    int[] Queue;

    public MyQueue(int size) {
       this.size = size;
       this.front = -1;
       this.rear = -1;

        this.Queue = new int[size];
    }

    // Check Empty
    public boolean isEmpty() {

        if (front == -1 && rear == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {

        if ((front == 0 && rear == size - 1) ||
            (rear == front - 1)) {

            return true;

        } else {

            return false;
        }
    }

    public void enqueue(int data) {

        if (isFull()) {
          System.out.println("Queue is Full");

        } else {
             if (isEmpty()) {

                front = 0;
                rear = 0;

            } else if (rear == size - 1) {
                rear = 0;

            } else {

                rear++;
            }

            Queue[rear] = data;

            System.out.println("Data Inserted");
        }
    }
    public void dequeue () {
    	if(isEmpty()) {
    		System.out.println("Queue is Empty");
    	}else  {
    		int x = Queue[front];
    		if(front == rear) {
    		front = -1;
    		rear = -1;
    	}else if(front == size -1) {
    		front=0;
    	}else {
    		front++;
    	}
    System.out.println(x + "is deleted");
    }
 }
    
  public void peek() {

        if (isEmpty()) {

            System.out.println("Queue is Empty");

        } else {

            System.out.println("Peek Element = " + Queue[front]);
        }
    }
   public void display() {
	   if(isEmpty()) {
		   System.out.println("Queue is Empty");
	   }else {
		   int i = front;
		   while (i!= rear) {
			   System.out.println(Queue[i]);
             if(i== size -1 ) {
            	 i = 0;
             }else {
            	 i++;
             }
		   }
		   System.out.println(Queue[i]);
	   }
   }
    
}