package recursion;

public class NCr {
    public static void main(String[] args) {
        System.out.println(nCr(5, 3));
    }

    public static int nCr(int n, int r) {
        if (n == r || r == 0) return 1;
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }
}
