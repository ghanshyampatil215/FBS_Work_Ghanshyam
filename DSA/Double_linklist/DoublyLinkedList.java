package com.fbs.demo;

public class DoublyLinkedList {

	DoublyNode start = null;

	// Insert at Beginning
	void insertAtBeg(int ele) {

		DoublyNode temp = new DoublyNode(ele);

		if (start == null) {
			start = temp;
			return;
		}

		temp.next = start;
		start.prev = temp;
		start = temp;

		System.out.println("Data inserted at beginning!");
	}

	// Insert at End
	void insertAtEnd(int ele) {

		DoublyNode temp = new DoublyNode(ele);

		if (start == null) {
			start = temp;
			System.out.println("Data inserted at end!");
			return;
		}

		DoublyNode p = start;

		while (p.next != null) {
			p = p.next;
		}

		p.next = temp;
		temp.prev = p;

		System.out.println("Data inserted at end!");
	}
	
	//insertAtpos
	void insertAtpos(int data, int pos) {
		DoublyNode temp = new DoublyNode(data);
		if(pos<1) {
			System.out.println("Invlaid Position");
			return;
		}
		if(pos == 1) {
			temp.next = start;
			
			if(start != null) {
			 start.prev = temp;
		}
		
		start = temp;
		
		System.out.println("data inserted at position" +pos);
		return;
	}
	int count = 0;
	DoublyNode ptr = start;
	while (count < pos-1 && ptr!=null) {
		count++;
		ptr = ptr.next;
	}
	
	//Invalid position
	if( ptr == null || ptr.next == null && count < pos-1) {
		System.out.println("Invalid Position");
		return;
	}
	//insert between nodes
	temp.next = ptr.next;
	temp.prev = ptr;
     
	 if (ptr.next != null) {
		 ptr.next.prev = temp;
	 }
	 ptr.next = temp;
	 
	 System.out.println("data inseted at postion" + pos);
	}
	
	// Delete From Beg
	void deleteFromBeg() {
		if(start == null) {
			System.out.println("list is empty");
			return;
		}
		if(start.next == null) {
			start = null;
			return;
		}
		start = start.next;
		start.prev=null;
	}
	
	// DeleteFromEnd 
	void deleteFromEnd() {
		if(start == null) {
			System.out.println("List is empty");
			return;
		}
		if(start.next == null) {
			start = null;
			return;
		}
		DoublyNode ptr=start;
		
		while(ptr.next != null) {
			ptr=ptr.next;
		}
		ptr.prev.next = null;
	}
	

	
	//DeleteAtpos 
	void deleteFromPos(int pos) {
		
		if(start == null) {
			System.out.println("list is empty");
			return;
		}
		if(pos < 1) {
			System.out.println("invalid Position");
			return;
		}
		
		//delete First node
		if(pos == 1) {
			start = start.next;
			
			if(start != null) {
				start.prev = null;
			}
			
			System.out.println("data deleted from position" + pos);
			return;
		}
		
		int count = 1;
		DoublyNode ptr= start;
		
		//Reach to required position
		while (count < pos && ptr != null){
		   ptr = ptr.next;
		   count++;
		}
		
		//Invalid position
		if(ptr == null) {
			System.out.println("invalid Position");
			return;
		}
		
		//Delete node 
		ptr.prev.next = ptr.next;
		
		if(ptr.next != null) {
			ptr.next.prev = ptr.prev;
		}
		
		System.out.println("data deleted from position" + pos);
	}
	

	
	// Sort Doubly Linked List
	void sort() {

	    if (start == null || start.next == null) {
	        return;
	    }

	    DoublyNode p = start;

	    while (p != null) {

	        DoublyNode q = p.next;

	        while (q != null) {

	            if (p.data > q.data) {

	                int temp = p.data;
	                p.data = q.data;
	                q.data = temp;
	            }

	            q = q.next;
	        }

	        p = p.next;
	    }

	    System.out.println("Data sorted successfully!");
	}


	
	// Display
	void display() {

		if (start == null) {
			System.out.println("Doubly Linked List is Empty!");
			return;
		}
		
		sort(); //Display sort

		DoublyNode p = start;

		while (p != null) {

			System.out.print(p.data + " <-> ");

			p = p.next;
		}

		System.out.println("null");
	}
}