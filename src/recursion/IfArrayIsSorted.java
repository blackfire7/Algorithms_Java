package recursion;

public class IfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        System.out.println(arraySortedOrNot(arr, arr.length));
    }

    public static boolean arraySortedOrNot(int[] arr, int n) {
        if (arr == null || n < 2) return true;
        if (arr[n - 2] > arr[n - 1]) return false;
        return arraySortedOrNot(arr, n - 1);
    }
}
