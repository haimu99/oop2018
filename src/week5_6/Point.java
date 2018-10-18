package week5_6;

public class Point {

    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setToaDo(int a, int b) {
        this.x = a;
        this.y = b;
    }
    //kiem tra toa do 2 diem giong nhau
    public boolean isSameP(Point a){
        if(x==a.getX()&&y==a.getY())
            return true;
        return false;
    }

    public String toString() {
        return "Point{ " +
               " x = " + this.x +
               " y = " + this.y +
               " };";
    }

}

