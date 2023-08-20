package recursion;

public class FastPowerFunctionWithModulo {

    public static void main(String[] args) {
        System.out.println(myPow(7, 7, 30));
    }

    public static double myPow(double x, int n, int p) {
        if (n == 0) return 1;
        else if (n < 0) return myPow(1/x, Math.abs(n), p);
        else if (n % 2 == 0) return myPow((x % p * x % p) % p, n/2, p);
        else return (x % p * myPow(x, n - 1, p) % p) % p;
    }
}
