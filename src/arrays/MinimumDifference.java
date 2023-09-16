package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] arr = {12, 9, 8, 2, 11};
        System.out.println(minimumDiff(arr));
    }

    public static List<List<Integer>> minimumDiff(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int n = arr.length;

        for (int i = 1; i < n; i++) minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);

        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                List<Integer> temp = new ArrayList<>();

                temp.add(arr[i - 1]);
                temp.add(arr[i]);

                ans.add(temp);
            }
        }

        return ans;
    }
}
