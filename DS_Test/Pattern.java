//write a program to print following pattern 
//ABCDE 
//BCDE 
//CDE 
//DE 
//E 
//CDE 
//BCDE
// ABCDE

package p1;

public class Pattern {
  //UpperCase
	public static void main(String[] args) {
		
		for (int i = 0; i<5; i++) {
			for(int j =i; j<5; j++) {
				System.out.println((char)('A' + j));
			}
			System.out.println();
		}
	//LowerCase	
		for (int i = 3; i>=0; i--) {
			for(int j = i; j<5; j++) {
				System.out.println((char)('A' +j));
			}
			
			System.out.println();
		}

	}

}
