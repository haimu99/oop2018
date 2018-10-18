package week5_6;


public class main {

    public static void main(String[] args) {

        Layer myLayer = new Layer();
        System.out.println(myLayer.toString());
        System.out.println("Tao cac Shape trong 1 layer");
        
        myLayer.deleteTriangle();
        
        System.out.println(myLayer.toString());
        System.out.println("Xoa cac Triangle trong 1 layer");

        Diagram myDiagram = new Diagram();
        
        System.out.println(myDiagram.toString());
        System.out.println("Tao cac Layer trong 1 diagram");
        
        myDiagram.deleteCircle();
        
        System.out.println(myDiagram.toString());
        System.out.println("Xoa cac Circle trong 1 diagram");

    }
}

