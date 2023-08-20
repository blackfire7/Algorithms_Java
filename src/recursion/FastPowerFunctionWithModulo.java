package recursion;

public class FastPowerFunctionWithModulo {

    public static void main(String[] args) {
        System.out.println(myPow(7, 7, 30));
    }

    public static double myPow(double a, int b, int m) {
        if (b == 0) return 1;
        else if (b < 0) return myPow(1/a, Math.abs(b), m);
        else if (b % 2 == 0) return myPow((a % m * a % m) % m, b/2, m);
        else return (a % m * myPow(a, b - 1, m) % m) % m;
    }
}
