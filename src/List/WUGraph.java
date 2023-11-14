package List;

import java.util.LinkedList;




public class WUGraph {
    int vertices;
    LinkedList<Node>[] adjList;

    WUGraph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int source, int destination,int weight){
        adjList[source].add(new Node (destination,weight));
        adjList[destination].add(new Node (source,weight));
    }
    public void printGraph(){
        for (int i = 0 ; i<vertices;i++){
            LinkedList<Node> list = adjList[i];
            System.out.print("Sommet "+i+" :");

            for (int j = 0 ; j <list.size();j++){
                System.out.print("-> [Destination : " + list.get(j).value+" , Poids : "+list.get(j).weight+"]");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        WUGraph graph = new WUGraph(5);
        graph.addEdge(0,1,2);
        graph.addEdge(0,4,3);
        graph.addEdge(0,3,5);
        graph.addEdge(1,2,4);
        graph.addEdge(1,3,3);
        graph.addEdge(2,3,4);
        graph.addEdge(3,4,2);
        graph.addEdge(4,3,2);
        graph.printGraph();
    }
}