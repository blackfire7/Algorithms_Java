package otherPrograms;

public class Fibonacci {
    public static void main(String[] args) {
        int totalFibonacciNumbers = 10;
        fib(totalFibonacciNumbers);
    }

    public static void fib(int n) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while(counter < n) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }
}
