class Shape {
	double area;

	Shape() {
		this.area = 0;
		System.out.println("Default Constructor of Shape");
	}

	Shape(double area) {
		this.area = area;
		System.out.println("Parameterized Constructor of Shape");
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}

	void display() {
		System.out.println("Area: " + this.area);
	}
}


class Circle extends Shape {

	double radius;

	Circle() {
		super();

		this.radius = 0;

		System.out.println("Default Constructor of Circle");
	}

	Circle(double radius) {
		super();

		this.radius = radius;
		this.area = Math.PI * radius * radius;

		System.out.println("Parameterized Constructor of Circle");
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
		this.area = Math.PI * radius * radius;
	}

	void display() {
		super.display();

		System.out.println("Radius: " + this.radius);
	}
}


class Triangle extends Shape {

	double base;
	double height;

	Triangle() {
		super();

		this.base = 0;
		this.height = 0;

		System.out.println("Default Constructor of Triangle");
	}

	Triangle(double base, double height) {
		super();

		this.base = base;
		this.height = height;
		this.area = 0.5 * base * height;

		System.out.println("Parameterized Constructor of Triangle");
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
		this.area = 0.5 * this.base * this.height;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
		this.area = 0.5 * this.base * this.height;
	}

	void display() {
		super.display();

		System.out.println("Base: " + this.base);
		System.out.println("Height: " + this.height);
	}
}


class Rectangle extends Shape {

	double length;
	double breadth;

	Rectangle() {
		super();

		this.length = 0;
		this.breadth = 0;

		System.out.println("Default Constructor of Rectangle");
	}

	Rectangle(double length, double breadth) {
		super();

		this.length = length;
		this.breadth = breadth;
		this.area = length * breadth;

		System.out.println("Parameterized Constructor of Rectangle");
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
		this.area = this.length * this.breadth;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
		this.area = this.length * this.breadth;
	}

	void display() {
		super.display();

		System.out.println("Length: " + this.length);
		System.out.println("Breadth: " + this.breadth);
	}
}


class ShapeTest {
	public static void main(String[] args) {

		Circle c1 = new Circle(5);

		Triangle t1 = new Triangle(10, 6);

		Rectangle r1 = new Rectangle(10, 5);

		System.out.println();

		System.out.println("Circle Details:");
		c1.display();

		System.out.println();

		System.out.println("Triangle Details:");
		t1.display();

		System.out.println();

		System.out.println("Rectangle Details:");
		r1.display();
	}
}