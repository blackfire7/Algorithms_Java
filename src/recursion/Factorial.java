package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    public static int factorial(int n) {
        if (n < 2) return 1;
        return n * factorial(n - 1);
    }
}
