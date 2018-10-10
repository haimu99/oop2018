package week4.task2;

public class Main {
	public static void main(String[] args) {
		Shape shape1=new Shape("red", true);
		System.out.println(shape1.toString());
		Circle c1=new Circle(3);
		System.out.println(c1.toString());
		Rectangle r1=new Rectangle(3, 5);
		System.out.println(r1.toString());
		Square s1=new Square(4);
		System.out.println(s1.toString());
	}
}
