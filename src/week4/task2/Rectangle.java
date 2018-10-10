package week4.task2;

public class Rectangle extends Shape{
	private double width=1, length=1;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	// dien tich hcn
	public double getArea() {
		return getLength()*getWidth();
	}
	// chu vi hcn
	public double getPerimeter() {
		return 2*(getLength()+getWidth());
	}
	public String toString() {
		return "width: "+getWidth()+"\nlength: "+getLength()+"\narea: "+getArea()+"\nperimeter: "+getPerimeter()+"\n";
	}
}
