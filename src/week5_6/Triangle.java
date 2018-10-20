package week5_6;

public class Triangle extends Shape {
    private double radius;
    
    
    public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public Triangle() {
		super();
	}
    

	public Triangle(int radius) {
		super();
		this.radius = radius;
	}
	


	public Triangle(int x, int y, String color, int radius) {
		super(x, y, color, "Triangle");
		this.radius = radius;
	}


	public boolean isSame(Shape y) {
        Triangle x =  (Triangle) y;
        if ((this.getToaDo().isSameP(x.getToaDo())) && (this.getRadius()==x.getRadius()))
        	return true;
        else return false;
    }

    public String toString() {
        return "Triangle ";
    }
}

