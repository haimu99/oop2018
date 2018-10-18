package week5_6;

import java.util.ArrayList;


public class Layer {

    ArrayList<Shape> Shapes = new ArrayList<>();


    Layer() {
        this.Shapes = new ArrayList<>();
        this.Shapes.add(new Rectangle(0,0,10,5,"red"));
        this.Shapes.add(new Circle(5,6,8,"blue"));
        this.Shapes.add(new Triangle(1,1,2,2,3,3, "green"));
        this.Shapes.add(new Square(3,4,5, "yellow"));
        this.Shapes.add(new Rectangle(0,0,10,5,"red"));
        this.Shapes.add(new Circle(5,6,8,"blue"));
        this.Shapes.add(new Triangle(1,1,2,2,3,3, "green"));
        this.Shapes.add(new Square(3,4,5, "yellow"));
        
    }
    //xoa cac Triangle

    public void deleteTriangle() {
        for (int i = this.Shapes.size() - 1; i >= 0; i--) {
            if (this.Shapes.get(i) instanceof Triangle) {
                this.Shapes.remove(i);
            }
        }
    }

    //xoa cac Circle
    public void deleteCircle() {
        for (int i = this.Shapes.size() - 1; i >= 0; i--) {
            if (this.Shapes.get(i) instanceof Circle) {
                this.Shapes.remove(i);
            }
        }
    }

    public String toString() {
        String s = "";
    
        for (int i = this.Shapes.size() - 1; i >= 0; i--) 
                s+= this.Shapes.get(i).toString();
          
        return s;
    }
}