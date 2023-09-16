package arrays;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(-1);
        System.out.println(maximumAbsoluteDifference(a));
    }

    public static int maximumAbsoluteDifference(ArrayList<Integer> A) {
        int n = A.size();

        int[] aipi = new int[n];
        int[] aimi = new int[n];

        for (int i = 0; i < n; i++) {
            aipi[i] = A.get(i) + i;
            aimi[i] = A.get(i) - i;
        }

        int minAipi = Integer.MAX_VALUE;
        int maxAipi = Integer.MIN_VALUE;

        int minAimi = Integer.MAX_VALUE;
        int maxAimi = Integer.MIN_VALUE;

        for (int e : aipi) {
            minAipi = Math.min(minAipi, e);
            maxAipi = Math.max(maxAipi, e);
        }

        for (int e : aimi) {
            minAimi = Math.min(minAimi, e);
            maxAimi = Math.max(maxAimi, e);
        }

        return Math.max ((maxAipi - minAipi), (maxAimi - minAimi));

    }
}
