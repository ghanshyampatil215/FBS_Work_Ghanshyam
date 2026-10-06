package p1;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String string) {
      super(string);
   }
}

class voter {
	int age ;
	 
	public voter(int age) {
	  this.age=age;	
	}
	
	void validateAge() throws InvalidAgeException{
		 if(this.age>=18) {
			 System.out.println("you are egligible to vote !");
		 }else {
			 throw new InvalidAgeException("you are not egligible to vote");
		 }
	}
}

public class test {

	public static void main(String[] args) {
        voter v1= new voter (17);		
         try {
        	 v1.validateAge();
         }catch (InvalidAgeException e) {
        	 System.out.println(e.getMessage());
        	
         }
	}

}
