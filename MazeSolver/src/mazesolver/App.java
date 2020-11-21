package mazesolver;

public class App {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader(
                "/home/andre/NetBeansProjects/MazeSolver/src/mazesolver/map.txt"
                , 7, 7
        );
        fileReader.parseFile();
        
        
        MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),
                                               fileReader.getStartPositionRow(),
                                               fileReader.getStartPositionCol()
        );
        mazeSolver.findWayOut();
    }
}
