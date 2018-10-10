package week4.task2;

public class Circle extends Shape{
	private double radius=1;
	// khai bao so pi
	final double pi=3.14;

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		super();
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	// tinh dien tich hinh tron
	public double getArea() {
		return pi*getRadius()*getRadius();
	}
	// chu vi hinh tron
	public double getPerimeter() {
		return 2*pi*getRadius();
	}
	public String toString() {
		return "radius= "+getRadius()+"\narea: "+getArea()+"\nperimeter: "+getPerimeter()+"\n";
	}
	
}
