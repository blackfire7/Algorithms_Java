package arrays;

public class MaxChunksToMakeSorted1 {
    public static void main(String[] args) {
        int[] a = {2, 0, 1, 5, 3, 4, 6};
        System.out.println(maxChunks(a));
    }

    public static int maxChunks(int[] arr) {
        if (arr.length == 0) return 0;

        int chunks = 0;
        int maxTillNow = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxTillNow = Math.max(maxTillNow, arr[i]);
            if (i == maxTillNow) chunks++;
        }

        return chunks;
    }

    /**
     * You are given an integer array A of length n that represents a permutation of the integers in the range [0, n - 1].
     * We split A into some number of Partitions, and individually sort each chunk. After joining them, the result should equal the sorted array.
     * Return the largest number of chunks we can make to sort the array.
     */
}
