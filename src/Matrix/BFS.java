package Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void bfs(int [][] matrix,boolean[][] visited, int r , int c){
        int row = matrix.length , col = matrix[0].length;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(r,c));
        visited[r][c]= true;
        int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            Pair curr = queue.poll();
            int first = curr.first;
            int second = curr.second;
            System.out.print(matrix[first][second]+" ");
            for (int i = 0 ; i < 4 ; i++){
                int adjX = first + direction[i][0];
                int adjY = second + direction[i][1];
                if (adjX < 0 || adjX>=row|| adjY<0|| adjY >= col || visited[adjX][adjY]) continue;
                queue.add(new Pair(adjX,adjY));
                visited[adjX][adjY]=true;

            }

        }
    }
    public static void main(String args){
        System.out.println("Basic Example:");
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        boolean[][] visited=new boolean[matrix.length][matrix[0].length];
        bfs(matrix,visited,0,0);
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] undirectedUnweighted = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 0, 1, 1, 0}
        };
        boolean[][] visitedUndirectedUnweighted = new boolean[5][5];
        System.out.println("BFS for Undirected Unweighted Graph:");
        bfs(undirectedUnweighted, visitedUndirectedUnweighted, 0, 0);
        System.out.println();


        int[][] directedUnweighted = {
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}
        };
        boolean[][] visitedDirectedUnweighted = new boolean[5][5];
        System.out.println("BFS for Directed Unweighted Graph:");
        bfs(directedUnweighted, visitedDirectedUnweighted, 0, 0);
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
        System.out.println("BFS for Undirected Weighted Graph:");
        bfs(undirectedWeighted, visitedUndirectedWeighted, 0, 0);
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
        System.out.println("BFS for Directed Weighted Graph:");
        bfs(directedWeighted, visitedDirectedWeighted, 0, 0);
        System.out.println();

    }
}
