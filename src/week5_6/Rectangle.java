package week5_6;


public class Rectangle extends Shape{
    private int width = 1, length = 1;
    

    public Rectangle() {
    }

    public Rectangle(int x,int y,int width,int length,String color) {
        super(x,y,color,"Rectangle");
        this.width = width;
        this.length = length;
  
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    // tinh dien tich
    public int getArea() {
        return width * length;
    }
    
    // tinh chu vi
    public int getPerimeter() {
        return (width + length)*2;
    }
    // kiem tra co phai Rectangle
    public boolean isRectangle() {
        return this.getName().equals("Rectangle");
    }
    // kiem tra 2 rectangle co trung nhau ko
    public boolean isSame(Shape y) {
        Rectangle x = (Rectangle) y;   
        if ((this.getToaDo().isSameP(x.getToaDo())) && (this.getWidth()==x.getWidth()) && (this.getLength()==x.getLength()) ) 
        return true;
        else return false;
    }

    public String toString() {
        return "Rectangle ";
    }
}
