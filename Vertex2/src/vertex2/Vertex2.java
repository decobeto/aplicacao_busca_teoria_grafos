package vertex2;

import java.util.ArrayList;
import java.util.List;

public class Vertex2 {
    
    private String name;
    private boolean visited;
    private boolean beingVisited;
    private List<Vertex2> adjacencyList;
    
    public Vertex2(String name){
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }
    
    public void addNeighbor(Vertex2 v){
        this.adjacencyList.add(v);
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isVisited() { return visited; }
    public void setVisited(boolean visited) { this.visited = visited; }
    
    public boolean isBeingVisited() { return beingVisited; }
    public void setBeingVisited(boolean beingVisited) {  this.beingVisited =  beingVisited; }
    
    public List<Vertex2> getAdjacencyList(){
        return adjacencyList;
    }
    
    public void setAdjacencyList(List<Vertex2> adjacencyList){
        this.adjacencyList = adjacencyList;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
}
