package recursion;

public class Josephus {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(solve(n, k) + 1);
    }

    public static int solve(int n, int k) {
        if (n == 1) return 0;
        return (solve(n - 1, k) + k) % n;
    }
}
