package p1;

public class SinglyLinkedList {
	
	   Node start;
	   
	   //insert element 
	   public void insert(int data) {
		   
		   Node temp = new Node(data);
		   
		   if(start == null || data < start.data) {
			   temp.next = start;
			   start = temp;
			   
			   System.out.println("data inserted");
			   return;
		   }
		   Node ptr = start;
		   
		   while(ptr.next != null && ptr.next.data<data) {
			   ptr = ptr.next;
		   }
		   
		   temp.next = ptr.next;
		   ptr.next = temp;
		   
		   System.out.println("data inserted");
	   }
	   
	   //display
	   public void display() {
		   if(start == null) {
			   System.out.println("List is Empty");
                 return;
		   }
		   Node ptr = start;
		   while(ptr != null) {
			 System.out.println(ptr.data +" ->");
			 
			 ptr = ptr.next;
		   }
		   
		   System.out.println("null");
	   }
	   
	   //delete element
	   public void delete(int data) {
		     if(start == null) {
		    	 System.out.println("List is empty");
		    	 return;
		     }
		     
		     if(start.data == data) {
		    	 start = start.next;
		    	 
		    	 System.out.println(data +" is deleted");
		    	 return;
		    	
		     }
		     
		     Node ptr = start;
		     while(ptr.next != null && ptr.next.data != data ) {
		    	 ptr = ptr.next;
		     }
		     if(ptr.next == null) {
		    	  System.out.println(data + "Is not found");
		    	  
		     } else {
		    	 ptr.next = ptr.next.next;
		    	 
		    	 System.out.println(data + "is deleted");
		     }
	   }

}
