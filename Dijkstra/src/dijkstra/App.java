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
        
        vA.addNeigbor(new Edge(12, vA, vB));
        vA.addNeigbor(new Edge(4, vA, vC));
        
        vB.addNeigbor(new Edge(3, vB, vE));
        vB.addNeigbor(new Edge(5, vB, vD));
        
        vC.addNeigbor(new Edge(2, vC, vD));
        vC.addNeigbor(new Edge(6, vC, vF));
        
        vD.addNeigbor(new Edge(8, vD, vG));
        
        vE.addNeigbor(new Edge(7, vE, vH));
        
        vF.addNeigbor(new Edge(5, vF, vG));
        
        vG.addNeigbor(new Edge(3, vG, vH));
        
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        dijkstraAlgorithm.computePaths(vA);
        
        System.out.println("Distância até H: " + vH.getDistance());
        System.out.println("Rota mais curta de A até H: " + dijkstraAlgorithm.getShortestPathTo(vH));
    }
 
}
