package com.file.dsa;

public class ComapreLinkedList {
	public static boolean compare(Node start1,Node start2) {
		Node p = start1;
		Node q = start2;
		
		while(p!=null && q!=null) {
			
			if(p.data!=q.data) {
				return false;
			}
			
			p=p.next;
			q=q.next;
			
		}
		return p == null && q == null;
	}
	

	public static void main(String[] args) {
		
		Node start1 = new Node (10);
		start1.next = new Node(20);
		start1.next.next=new Node(30);
		
		Node start2 = new Node(10);
		start2.next= new Node(20);
		start2.next.next = new Node(30);

	}
}

