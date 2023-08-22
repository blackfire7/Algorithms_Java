package backtracking;

public class KnightsTourProblem {

    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int[][] a = nightsTour(n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] nightsTour(int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = -1;
            }
        }

        a[0][0] = 0;
        int[] movesX = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] movesY = {1, 2, 2, 1, -1, -2, -2, -1};
        nightsTourHelper(n, m, a, movesX, movesY, 0, 0, 1);
        return a;
    }

    public static boolean nightsTourHelper(int n, int m, int[][] a, int[] movesX, int[] movesY, int curX, int curY, int step) {
        if (step == n * n) return true;

        for (int i = 0; i < 8; i++) {
            int nextX = curX + movesX[i];
            int nextY = curY + movesY[i];

            if (isValid(n, m, a, nextX, nextY)) {
                a[nextX][nextY] = step;
                if (nightsTourHelper(n, m, a, movesX, movesY, nextX, nextY, step + 1)) return true;
                else a[nextX][nextY] = -1;
            }
        }

        return false;
    }

    public static boolean isValid(int n, int m, int[][] a, int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < m && a[x][y] == -1;
    }

}
