
public class Shape {
     void calculateArea() {
    	 System.out.println("Calculating area");
     }
	public static void main(String[] args) {
		
		Shape s;
		
		s= new Circle(5);
		s.calculateArea();
		
		s=new Triangle(10,8);
		s.calculateArea();
		
		s=new Rectangle(10,5);
		s.calculateArea();

	}

}

class Circle extends Shape {
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	
	void calculateArea() {
		System.out.println("Radius:" + radius);
		System.out.println("Area of ciricle: "+(3.14 * radius * radius));
		System.out.println();
	}
}

class Triangle extends Shape {
	double base;
	double height;
	
	 Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	void calculateArea() {
		System.out.println("Base:"+base);
		System.out.println("Height:"+ height);
		System.out.println("Area of traingle:"+(0.5*base*height));
		System.out.println();
	}
}
class Rectangle extends Shape {
	double length;
	double breadth;
	
	Rectangle(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	void calculateArea() {
		System.out.println("length:" +length);
		System.out.println("Breadth:" +breadth);
		System.out.println("Area of rectangle:" +(length * breadth));
	}
}