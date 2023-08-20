package recursion;

public class FastPowerFunctionWithModulo {

    public static void main(String[] args) {
        System.out.println(myPow(2, 5, 2));
    }

    public static double myPow(double x, int n, int p) {
        return (Math.pow(x, n)) % p;
    }
}
