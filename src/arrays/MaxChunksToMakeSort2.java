package arrays;

public class MaxChunksToMakeSort2 {
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 6, 5, 8, 7};
        System.out.println(maxChunks(a));
    }

    public static int maxChunks(int[] arr) {
        int n = arr.length;
        int chunks = 0;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        right[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) left[i] = Math.max(left[i - 1], arr[i]);

        for (int i = n - 2; i >= 0; i--) right[i] = Math.min(right[i + 1], arr[i]);

        for (int i = 0; i < n - 1; i++) if (left[i] <= right[i + 1]) chunks++;

        return ++chunks;
    }

    /**
    * You are given an integer array arr.
    * We split arr into some number of chunks (i.e., partitions), and individually sort each chunk. After concatenating them, the result should equal the sorted array.
    * Return the largest number of chunks we can make to sort the array.
    * */
}
