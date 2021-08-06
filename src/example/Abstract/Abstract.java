package example.Abstract;

// Abstract class
abstract class Shape {
	String objectName = " ";
	Shape(String name){
		this.objectName = name;
	}

	// Abstract methods
	abstract public double area();
	abstract public void draw();
}

// Rectangle class which inherits the Shape abstract class
class Rectangle extends Shape {
	int length, width;
	Rectangle(int length, int width, String name) {
		super(name);
		this.length = length;
		this.width = width;
	}

	// First implementation of the abstract methods draw() and area()
	@Override
	public void draw() {
		System.out.println("A rectangle has been drawn.");
	}
	@Override
	public double area() {
		return (double) (length * width);
	}
}

// Circle class which also inherits the Shape abstract class
class Circle extends Shape {
	double pi = 3.14;
	int radius;
	Circle(int radius, String name){
		super(name);
		this.radius = radius;
	}
	// Second implementation of the abstract methods draw() and area()
	@Override
	public void draw() {
		System.out.println("A circle has been drawn.");
	}
	@Override
	public double area() {
		return (double) ((pi * radius * radius) / 2);
	}
}

//Test class
class Test {
	public static void main(String[] args) {
		Shape rect = new Rectangle(40, 60, "Rectangle");
		System.out.println("The area of the rectangle is: " + rect.area());
		Shape circle = new Circle(50, "Circle");
		System.out.println("The area of the circle is: " + circle.area());
	}
}