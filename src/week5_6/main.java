package week5_6;


public class main {

    public static void main(String[] args) {

    	// tao cac shape trong layer
        Layer myLayer = new Layer();
        System.out.println(myLayer.toString());

        //xoa Triangle trong layer
        myLayer.deleteTriangle();
        System.out.println(myLayer.toString()+"\n");

        //tao cac layer trong Diagram
        Diagram myDiagram = new Diagram();
        System.out.println(myDiagram.toString());
        // xoa Circle trong Diagram
        myDiagram.deleteCircle();
        System.out.println(myDiagram.toString());
        

    }
}

