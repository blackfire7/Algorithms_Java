package backtracking;

import java.util.ArrayList;

public class GenerateParenthesis {

    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> list = new ArrayList<>();
        System.out.println(generateParenthesis(list, "", n, 0, 0, 0));
    }

    public static ArrayList<String> generateParenthesis(ArrayList<String> list, String cur, int n, int i, int open, int close) {
        if (i == 2 * n) {
            list.add(cur);
        }

        if (open < n) {
            cur += '(';
            generateParenthesis(list, cur, n, i + 1, open + 1, close);
            cur = cur.substring(0, cur.length() - 1); // BACKTRACKING
        }

        if (close < open) {
            cur += ')';
            generateParenthesis(list,cur, n, i + 1, open, close + 1);
        }

        return list;
    }
}
