package week5_6;

public class Square extends Shape {
    
    private int side;

    public Square() {
    }

    public Square(int x,int y,int side,String color) {
        super(x,y,color,"Square");
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    // tinh dien tich
    public double getArea() {
        return side* side;
    }
    // tinh chu vi
    public double getPerimeter() {
        return side * 4;
    }    
    // kiem tra Square
    public boolean isSquare() {
        return this.getName().equals("Square");
    }
    // kiem tra 2 hinh trung nhau
    public boolean isSame(Shape y) {
        Square x = (Square) y; 
        if ((this.getToaDo().isSameP(x.getToaDo())) && (this.getSide()==x.getSide())) return true;
        else return false;
    }

    public String toString() {
        return "Square ";
    }
}

