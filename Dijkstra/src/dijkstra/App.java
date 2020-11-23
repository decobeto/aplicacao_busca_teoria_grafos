package dijkstra;

public class App {
    public static void main(String[] args) {
        Vertex vA = new Vertex("A");
        Vertex vB = new Vertex("B");
        Vertex vC= new Vertex("C");
        Vertex vD = new Vertex("D");
        Vertex vE = new Vertex("E");
        Vertex vF = new Vertex("F");
        Vertex vG = new Vertex("G");
        Vertex vH = new Vertex("H");
        
        vA.addNeigbor(new Edge(20, vA, vB));
    }
 
}
