package Matrix;

import Matrix.UUGraph;
import Matrix.WUGraph;

public class Main {
    public static void main(String[] args) {
        // Create an undirected unweighted graph with 5 vertices
        UUGraph uuGraph = new UUGraph(5);

        // Add edges to the unweighted graph
        uuGraph.addEdge(0, 1);
        uuGraph.addEdge(0, 2);
        uuGraph.addEdge(1, 3);
        uuGraph.addEdge(2, 4);

        System.out.println("Undirected Unweighted Graph:");
        System.out.println(uuGraph);

        // Create an undirected weighted graph with 5 vertices
        WUGraph wuGraph = new WUGraph(5);

        // Add weighted edges to the weighted graph
        wuGraph.addEdge(0, 1, 3);
        wuGraph.addEdge(0, 2, 2);
        wuGraph.addEdge(1, 3, 5);
        wuGraph.addEdge(2, 4, 1);

        System.out.println("Undirected Weighted Graph:");
        System.out.println(wuGraph);
    }
}
