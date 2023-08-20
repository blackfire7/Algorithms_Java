package recursion;

public class FastPowerFunctionWithModulo {

    public static void main(String[] args) {
        System.out.println(myPow(7, 7, 30));
    }

    /**
     * this solution uses formulas of -
     *
     * 1. modulo
     * (a + b) % m = (a % m + a % m) % m
     * (a * b) % m = (a % m * a % m) % m
     *
     * 2. Fast Power
     * a^b = (a^2)^(b/2) if b is even
     * a^b = a * a^(b-1) if b is odd
     */

    public static double myPow(double x, int n, int p) {
        if (n == 0) return 1;
        else if (n < 0) return myPow(1 / x, Math.abs(n), p);
        else if (n % 2 == 0) return myPow((x % p * x % p) % p, n / 2, p);
        else return (x % p * myPow(x, n - 1, p) % p) % p;
    }
}
