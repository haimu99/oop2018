package week4.task2;

public class Square extends Rectangle{

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side,side);
	}
	public void setSide(double side) {
		setWidth(side);
		setLength(side);
	}
	public double getSide() {
		return getLength();
	}
	public void setWidth(double side) {
		super.setWidth(side);
	}
	public void setLength(double side) {
		super.setLength(side);
	}
	public String toString() {
		return "side= " +getLength();
		
	}
}
