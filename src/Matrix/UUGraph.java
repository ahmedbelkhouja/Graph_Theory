package Matrix;

class UUGraph {
    int adjMatrix[][];
    int vertices;

    public UUGraph(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < vertices; x++) {
            sb.append(x).append(":");
            for (int y = 0; y < vertices; y++) {
                if (adjMatrix[x][y] == 1) {
                    sb.append(y).append(", ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
