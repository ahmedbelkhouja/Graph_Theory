package Matrix;

public class WDGraph {
    int adjMatrix[][];
    int vertices;

    public WDGraph(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    public void addEdge(int i, int j, int weight) {
        adjMatrix[i][j] = weight;
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < vertices; x++) {
            sb.append(x).append(":");
            for (int y = 0; y < vertices; y++) {
                if (adjMatrix[x][y] != 0) {
                    sb.append(y).append("(").append(adjMatrix[x][y]).append("), ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

