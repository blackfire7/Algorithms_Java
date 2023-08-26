package recursion;

public class RecursionUnderstanding {

    public static void main(String[] args) {
        System.out.println(nthFibNumber(4));
    }

    // 0 1 1 2 3 5 8 13 21 34 ...
    public static int nthFibNumber(int n) {
        if (n <= 1) return n;
        return nthFibNumber(n - 1) + nthFibNumber(n - 2);
    }

}
