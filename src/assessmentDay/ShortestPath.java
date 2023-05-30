package assessmentDay;

//
//        Implement a function that receives a grid representing a labyrinth and computes the shortest path from the top left corner cell (start) to the bottom right coiner cell (end).
//
//        The primary input is a uniform 2D grid representing a labyrinth. Each entry in the grid will be either a 0 or 1. 1 represents a blocked wall, and 0 represents free space.
//
//        Your function will receive the dimensions of the grid, and the grid parsed from the input into native language data structures. It should return the length of the shortest path from start (top left cell) to the end (bottom right cell) as a single integer.
//
//        You can expect that there is always a path through the labyrinth
//
//        Sample input E
//
//        34
//
//        Sample output
//        5

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
    static int shortestPath(int rows, int cols, int[][] grid) {
        boolean[][] visited = new boolean[rows][cols];
        int[][] distance = new int[rows][cols];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        visited[0][0] = true;
        distance[0][0] = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            // if we have reached the end
            if (row == rows - 1 && col == cols - 1) {
                return distance[row][col];
            }
            // try to move up
            if (row > 0 && grid[row - 1][col] == 0 && !visited[row - 1][col]) {
                queue.add(new int[]{row - 1, col});
                visited[row - 1][col] = true;
                distance[row - 1][col] = distance[row][col] + 1;
            }
            // try to move down
            if (row < rows - 1 && grid[row + 1][col] == 0 && !visited[row + 1][col]) {
                queue.add(new int[]{row + 1, col});
                visited[row + 1][col] = true;
                distance[row + 1][col] = distance[row][col] + 1;
            }
            // try to move left
            if (col > 0 && grid[row][col - 1] == 0 && !visited[row][col - 1]) {
                queue.add(new int[]{row, col - 1});
                visited[row][col - 1] = true;
                distance[row][col - 1] = distance[row][col] + 1;
            }
            // try to move right
            if (col < cols - 1 && grid[row][col + 1] == 0 && !visited[row][col + 1]) {
                queue.add(new int[]{row, col + 1});
                visited[row][col + 1] = true;
                distance[row][col + 1] = distance[row][col] + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0},
                {1, 0, 0, 0},
                {0, 0, 1, 0}
        };
        System.out.println(shortestPath(3, 4, grid));
    }
}

//    boolean[][] visited = new boolean[rows][cols];
//    int[][] distance = new int[rows][cols];
//    Queue<int[]> queue = new LinkedList<>();
//        queue.add(new int[]{0, 0});
//                visited[0][0] = true;
//                distance[0][0] = 0;
//                while (!queue.isEmpty()) {
//                int[] current = queue.poll();
//                int row = current[0];
//                int col = current[1];
//                // if we have reached the end
//                if (row == rows - 1 && col == cols - 1) {
//                return distance[row][col];
//                }
//                // try to move up
//                if (row > 0 && grid[row - 1][col] == 0 && !visited[row - 1][col]) {
//                queue.add(new int[]{row - 1, col});
//                visited[row - 1][col] = true;
//                distance[row - 1][col] = distance[row][col] + 1;
//                }
//                // try to move down
//                if (row < rows - 1 && grid[row + 1][col] == 0 && !visited[row + 1][col]) {
//        queue.add(new int[]{row + 1, col});
//        visited[row + 1][col] = true;
//        distance[row + 1][col] = distance[row][col] + 1;
//        }
//        // try to move left
//        if (col > 0 && grid[row][col - 1] == 0 && !visited[row][col - 1]) {
//        queue.add(new int[]{row, col - 1});
//        visited[row][col - 1] = true;
//        distance[row][col - 1] = distance[row][col] + 1;
//        }
//        // try to move right
//        if (col < cols - 1 && grid[row][col + 1] == 0 && !visited[row][col + 1]) {
//        queue.add(new int[]{row, col + 1});
//        visited[row][col + 1] = true;
//        distance[row][col + 1] = distance[row][col] + 1;
//        }
//        }
//        return -1;
