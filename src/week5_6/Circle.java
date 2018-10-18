package week5_6;

public class Circle extends Shape{
    private double radius = 1.0 ;
    public final static double PI = 3.1415;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int x,int y,double ra,String color) {
        super(x,y,color,"Circle");
        this.radius = ra;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // tinh dien tich
    public double getArea() {
        return PI * radius * radius;
    }
    // tinh chu vi
    public double getPerimeter() {
        return PI * radius * 2;
    }
    // kiem tra hinh tron
    public boolean isCircle() {
        return this.getName().equals("Circle");
    }
    // kiem tra hinh trung nhau
    public boolean isSame(Shape y) {
        Circle x = (Circle) y;
        if ((this.getToaDo().isSameP(x.getToaDo())) && (this.getRadius()==x.getRadius())) return true;
        else return false;
    }

    public String toString() {
        return "Circle ";
    }
}
