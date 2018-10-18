package week5_6;

import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> layers;

    Diagram() {
        this.layers = new ArrayList<>();
        this.layers.add(new Layer());
        this.layers.add(new Layer());
        this.layers.add(new Layer());
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
        String ans = "";
        for (Layer layer : this.layers) {
            ans = ans + layer.toString() + "\n";
        }
        return ans;
    }
}
