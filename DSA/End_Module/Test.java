package com.file.dsa;

public class Test {

	public static void main(String[] args) {
		
		Stack s = new Stack(3);
		
		s.push(10);
		s.push(20);
		s.push(30);
        s.push(40);
        
        s.display();
        
        s.peek();
        
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        
        s.display();
	}

}
