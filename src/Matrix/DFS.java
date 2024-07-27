package Matrix;

public class DFS {
    public static void dfs(int matrix[][], boolean[][] visited, int r, int c) {

        int row = matrix.length, col = matrix[0].length;
        if (r < 0 || r >= row || c < 0 || c >= col || visited[r][c])
            return;
        System.out.print(matrix[r][c] + " ");
        visited[r][c] = true;
        dfs(matrix, visited, r + 1, c);
        dfs(matrix, visited, r - 1, c);
        dfs(matrix, visited, r, c + 1);
        dfs(matrix, visited, r, c + 1);

    }


    public static void main(String args[]) {
        System.out.println("Basic Example:");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        dfs(matrix, visited, 0, 0);
        System.out.println();


        int[][] undirectedUnweighted = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 0, 1, 1, 0}
        };
        boolean[][] visitedUndirectedUnweighted = new boolean[5][5];
        System.out.println("DFS for Undirected Unweighted Graph:");
        dfs(undirectedUnweighted, visitedUndirectedUnweighted, 0, 0);
        System.out.println();


        int[][] directedUnweighted = {
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}
        };
        boolean[][] visitedDirectedUnweighted = new boolean[5][5];
        System.out.println("DFS for Directed Unweighted Graph:");
        dfs(directedUnweighted, visitedDirectedUnweighted, 0, 0);
        System.out.println();

        // Example adjacency matrix for an undirected, weighted graph
        int[][] undirectedWeighted = {
                {0, 2, 0, 4, 0},
                {2, 0, 1, 3, 0},
                {0, 1, 0, 0, 5},
                {4, 3, 0, 0, 2},
                {0, 0, 5, 2, 0}
        };
        boolean[][] visitedUndirectedWeighted = new boolean[5][5];
        System.out.println("DFS for Undirected Weighted Graph:");
        dfs(undirectedWeighted, visitedUndirectedWeighted, 0, 0);
        System.out.println();


        // Example adjacency matrix for a directed, weighted graph
        int[][] directedWeighted = {
                {0, 2, 0, 4, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 5},
                {0, 0, 0, 0, 2},
                {0, 0, 5, 0, 0}
        };
        boolean[][] visitedDirectedWeighted = new boolean[5][5];
        System.out.println("DFS for Directed Weighted Graph:");
        dfs(directedWeighted, visitedDirectedWeighted, 0, 0);
        System.out.println();

    }
}



