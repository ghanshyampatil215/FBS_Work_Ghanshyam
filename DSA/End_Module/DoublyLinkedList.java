package com.file.dsa;

public class DoublyLinkedList {

 DNode start;
 
 //insert at Beginning
 public void insertAtBeginning(int data) {
	 
	 DNode temp = new DNode(data);
	 
	 if(start == null) {
		 start = temp;
		 
	 }else {
		 temp.next = start;
		 start.prev = temp;
		 start = temp;
	 }
	 System.out.println("data Inserted");
 }
 
 //insert at end
 public void insertEnd(int data) {
	 DNode temp = new DNode(data);
	 
	 if(start == null) {
		 start = temp;
	 }else {
		 DNode ptr = start;
		 
		 while(ptr.next!=null) {
			 ptr = ptr.next;
		 }
		 ptr.next = temp;
		 temp.prev = ptr;
	 }
	 System.out.println("Data inserted");
 }
 
 
 //delete from beg
 public void deleteFromBeginning() {
	 if(start == null) {
		 System.out.println("List is Empty");
		 return;
	 }
	 
	 int x = start.data;
	 start = start.next;
	 if(start != null) {
		 start.prev = null;
	 }
	 System.out.println(x + "Is deleted");
 }
 //display
 public void display() {
	 
	 if(start == null) {
		 System.out.println("List is Empty");
		 return;
	 }
	 
	 DNode ptr = start;
	 
	 while(ptr != null) {
		 System.out.println(ptr.data + "->");
		 ptr = ptr .next;
	 }
	 
	 System.out.println("null");
	 

 }
 
 public static void main(String[] args) {
	 
	 DoublyLinkedList list = new DoublyLinkedList();
	 
	 list.insertAtBeginning(20);
	 list.insertAtBeginning(10);
	 list.insertEnd(30);
	 
	 list.display();
	 
	 list.deleteFromBeginning();
	 
	 list.display();
 }
 
	
}
