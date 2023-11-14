package List;

import java.util.LinkedList;

public class UUGraph {
    int vertices;
    LinkedList<Integer>[] adjList;

    UUGraph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int source, int destination){
        adjList[source].add(destination);
        adjList[destination].add(source);
    }
    public void printGraph(){
        for (int i = 0 ; i<vertices;i++){
            LinkedList<Integer> list = adjList[i];
            System.out.print("Sommet "+i+" :");

            for (int j = 0 ; j <list.size();j++){
                System.out.print("-> [Destination : " + list.get(j)+"]");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        UUGraph graph = new UUGraph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,3);
        graph.printGraph();
    }
}