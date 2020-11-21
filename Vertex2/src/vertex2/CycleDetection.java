package vertex2;

import java.util.List;

public class CycleDetection {
    public void detectCycle(List<Vertex2> vertexList){
        for(Vertex2 v : vertexList){
            if(!v.isVisited()){
                dfs(v);
            }
        }
    }
    
    public void dfs(Vertex2 vertex){
        System.out.println("\nDFS on vertex " + vertex);
        vertex.setBeingVisited(true);
        
        for(Vertex2 v : vertex.getAdjacencyList()){
            System.out.println("Visiting the neighbors of vertex " + vertex + ", vertex " + v);
            
            if(v.isBeingVisited()){
                System.out.println("\n<<There is a backward edge, cycle detect in grapg!!!>>\n");
                return;
            }
            
            if(!v.isVisited()){
                dfs(v);
            }
        }
        
        System.out.println("Set vertex " + vertex + " setBeingVisited(false) and visited(true)...");
        vertex.setBeingVisited(false);
        vertex.setVisited(false);
    }
}
