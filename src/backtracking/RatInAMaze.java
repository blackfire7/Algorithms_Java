package backtracking;

import java.util.ArrayList;

public class RatInAMaze {

    static ArrayList<String> paths = new ArrayList<>();

    public static void main(String[] args) {
        int[][] m = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};

        paths = new ArrayList<>();

        System.out.println(findPath(m, m.length));
    }

    public static ArrayList<String> findPath(int[][] arr, int n) {
        int m = arr[0].length;

        boolean[][] vis = new boolean[n][m];
        vis[0][0] = true;

        return ratInMaze(arr, vis, 0, 0, "", n, m);
    }

    public static ArrayList<String> ratInMaze(int[][] mat, boolean[][] vis, int i, int j, String path, int n, int m) {
        if (mat[i][j] == 0) return new ArrayList<>();
        if (i == n - 1 && j == m - 1) {
            paths.add(path);
        }

        if (isValid(i + 1, j, mat, vis, n, m)) {
            vis[i + 1][j] = true;
            ratInMaze(mat, vis, i + 1, j, path + 'D', n, m); // DOWN
            vis[i + 1][j] = false;
        }

        if (isValid(i, j - 1, mat, vis, n, m)) {
            vis[i][j - 1] = true;
            ratInMaze(mat, vis, i, j - 1, path + 'L', n, m); // LEFT
            vis[i][j - 1] = false;
        }

        if (isValid(i, j + 1, mat, vis, n, m)) {
            vis[i][j + 1] = true;
            ratInMaze(mat, vis, i, j + 1, path + 'R', n, m); // RIGHT
            vis[i][j + 1] = false;
        }

        if (isValid(i - 1, j, mat, vis, n, m)) {
            vis[i - 1][j] = true;
            ratInMaze(mat, vis, i - 1, j, path + 'U', n, m); // UP
            vis[i - 1][j] = false;
        }

        return paths;
    }

    public static boolean isValid(int i, int j, int[][] mat, boolean[][] vis, int n, int m) {
        return i < n && i >= 0 && j < m && j >= 0 && mat[i][j] == 1 && !vis[i][j];
    }
}
