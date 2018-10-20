package week5_6;

import java.util.ArrayList;


public class Layer {

    ArrayList<Shape> Shapes = new ArrayList<>();


    Layer() {
        this.Shapes = new ArrayList<>();
        this.Shapes.add(new Rectangle(0,0,10,5,"red"));
        this.Shapes.add(new Circle(5,6,8,"blue"));
        this.Shapes.add(new Triangle(2, 4, "black", 2));
        this.Shapes.add(new Square(3,4,5, "yellow"));
        this.Shapes.add(new Rectangle(0,0,10,5,"red"));
        this.Shapes.add(new Triangle(-1, -2, "pink", 2));
        
    }
    //xoa cac Triangle

    public void deleteTriangle() {
        for (int i =0;i<this.Shapes.size();i++) {
            if (this.Shapes.get(i) instanceof Triangle) {
                this.Shapes.remove(i);
            }
        }
    }

    //xoa cac Circle
    public void deleteCircle() {
        for (int i =0;i<this.Shapes.size();i++) {
            if (this.Shapes.get(i) instanceof Circle) {
                this.Shapes.remove(i);
            }
        }
    }

    public String toString() {
        String layer = "";
    
        for (int i = this.Shapes.size() - 1; i >= 0; i--) 
                layer+= this.Shapes.get(i).toString();
          
        return layer;
    }
}