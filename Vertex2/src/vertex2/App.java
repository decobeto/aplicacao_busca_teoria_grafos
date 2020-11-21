package vertex2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Vertex2 v1 = new Vertex2("1");
        Vertex2 v2 = new Vertex2("2");
        Vertex2 v3 = new Vertex2("3");
        Vertex2 v4 = new Vertex2("4");
        Vertex2 v5 = new Vertex2("5");
        Vertex2 v6 = new Vertex2("6");
        
        v1.addNeighbor(v2);
        v1.addNeighbor(v3);
        v2.addNeighbor(v3);
        v4.addNeighbor(v1);
        v4.addNeighbor(v5);
        v5.addNeighbor(v6);
        v6.addNeighbor(v4);
        
        List<Vertex2> graph = new ArrayList<>();
        graph.add(v1);
        graph.add(v2);
        graph.add(v3);
        graph.add(v4);
        graph.add(v5);
        graph.add(v6);
        
        CycleDetection cycleDetection = new CycleDetection();
        cycleDetection.detectCycle(graph);
    }
}
