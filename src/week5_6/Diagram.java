package week5_6;

import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> layers;

    Diagram() {
        this.layers = new ArrayList<>();
        this.layers.add(new Layer());
        this.layers.add(new Layer());
        this.layers.add(new Layer());
    }
    //xoa circle trong diagram
    public void deleteCircle() {
        for (Layer layer: this.layers) {
            layer.deleteCircle();
        }
    }
     public String toString() {
        String diagram = "";
        for (Layer layer : this.layers) {
            diagram = diagram + layer.toString() + "\n";
        }
        return diagram;
    }
}
