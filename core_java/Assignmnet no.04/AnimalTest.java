class Animal {
	String name;
	int age;
	
	Animal(){
		this.name = "Not Given";
		this.age = 0;
		
		System.out.println("Default Constructor of Animal");
	}
	
	Animal (String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println("parameterized constructor of Animal");
	}
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age ;
	}
	void setAge(int age) {
		this.age = age;
	}
	void display() {
		System.out.println("Name:" +this.name);
		System.out.println("Age:"+ this.age);
	}
}

class Dog extends Animal {
	   String breed;
	   Dog(){
		   super();
		   this.breed = "Not Given";
		   
		   System.out.println("default Constructor of Dog");
	   }
	   
	   Dog(String name, int age, String breed) {
		   super(name, age);
		   this.breed = breed;
		   System.out.println("Parameterized Constructor of Dog");
	   }
	   String getBreed() {
		   return breed;
	   }
	   void setBreed(String breed) {
		   this.breed = breed;
	   }
	   void display() {
		   super.display();
		   
		   System.out.println("Breed:" + this.breed);
	   }
}

class cat extends Animal {
	String color;
	
	cat() {
		super();
		this.color = "Not Given";
		
		System.out.println("default Constructor of cat");
	}
	cat(String name,int age, String color){
		super(name, age);
		this.color = color;
		
		System.out.println("Parameterized Constructor of cat");
	}
	
	String getColor() {
	      return color;	
	}
	void setColor(String color) {
		this.color = color;
	}
	void display() {
		super.display();
		
		System.out.println("Color:"+ this.color);
	}
}
public class AnimalTest {
    
	public static void main(String[] args) {
	   
		Dog d1 = new Dog("Tommy", 3, "Labrador");
		cat c1 = new cat("Mini", 2, "WHite");
		
		System.out.println();
		
		System.out.println("Dog Details");
		d1.display();
		
		System.out.println();
		
		System.out.println("cat Details:");
	     c1.display();
	     }
}
