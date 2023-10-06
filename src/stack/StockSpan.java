package stack;

import java.util.ArrayDeque;

public class StockSpan {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] s = stockSpan(prices, prices.length);

        for (int e : s) {
            System.out.print(e + " ");
        }
    }

    public static int[] stockSpan(int[] price, int n) {
        int[] s = new int[n];

        s[0] = 1;

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        for (int i = 1; i < n; i++) {

            while(!stack.isEmpty()) {
                int top = stack.peek();

                if (price[top] > price[i]) break;
                else stack.pop();
            }

            if (stack.isEmpty()) s[i] = i + 1;
            else s[i] = i - stack.peek();

            stack.push(i);
        }

        return s;
    }
}
