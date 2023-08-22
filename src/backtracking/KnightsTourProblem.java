package backtracking;

public class KnightsTourProblem {

    public static void main(String[] args) {

        /* 1 <= N, M <= 7 */
        int n = 5, m = 5;

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
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = -1;

        if (n * 2 == m || m * 2 == n) return a;
        if (n > 2 && m > 2) a[0][0] = 0;
        if (n == 1 && m == 1) {
            a[0][0] = 0;
            return a;
        }

        int[] movesX = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] movesY = {1, 2, 2, 1, -1, -2, -2, -1};
        nightsTourHelper(n, m, a, movesX, movesY, 0, 0, 1);
        return a;
    }

    public static boolean nightsTourHelper(int n, int m, int[][] a, int[] movesX, int[] movesY, int curX, int curY, int step) {
        if (step == n * m) return true;

        for (int i = 0; i < 8; i++) {
            int nextX = curX + movesX[i];
            int nextY = curY + movesY[i];

            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && a[nextX][nextY] == -1) {
                a[nextX][nextY] = step;
                if (nightsTourHelper(n, m, a, movesX, movesY, nextX, nextY, step + 1)) return true;
                else a[nextX][nextY] = -1;
            }
        }

        return false;
    }

}
