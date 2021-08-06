package example.Interface;

// Interface with methods draw() and area() declared
interface Shape {
	void draw();
	double area();
}

// Rectangle class
class Rectangle implements Shape {
	int length, width;
	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	// First implementation of methods draw() and area()
	@Override
	public void draw() {
		System.out.println("A rectangle has been drawn.");
	}
	@Override
	public double area() {
		return (double) (length * width);
	}
}

// Circle class
class Circle implements Shape {
	double pi = 3.14;
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	// Second implementation of methods draw() and area()
	@Override
	public void draw() {
		System.out.println("A circle has been drawn.");
	}
	@Override
	public double area() {
		return (double) ((pi * radius * radius) / 2);
	}
}

// Test class
class Test {
	public static void main(String[] args) {
		Shape rect = new Rectangle(40, 60);
		System.out.println("The area of the rectangle is: " + rect.area());
		Shape circle = new Circle(50);
		System.out.println("The area of the circle is: " + circle.area());
	}
}

