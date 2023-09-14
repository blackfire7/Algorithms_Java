package arrays;

import java.util.Arrays;

public class MultipleLeftRotation {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3};

        System.out.println(Arrays.deepToString(multipleLeftRotationArray(a, b)));
    }

    public static int[][] multipleLeftRotationArray(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int[][] ans = new int[m][n];

        int[] temp = new int[2 * n];

        for (int i = 0; i < n; i++) temp[i] = temp[i + n] = a[i];

        for (int i = 0; i < m; i++) {
            int offset = b[i] % n; // for Right Rotation -> (n - b[i]) % n;
            for (int j = 0; j < n; j++) ans[i][j] = temp[j + offset];
        }

        return ans;
    }

}
