package stack;

import java.util.ArrayDeque;

public class ParenthesisMatching {
    public static void main(String[] args) {
        System.out.println(validParenthesis("(){}[]"));
    }

    public static boolean validParenthesis(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (cur == '(' || cur == '{' || cur == '[') {
                stack.push(cur);
            } else {
                if (stack.isEmpty()) return true;

                char opening = stack.pop();

                if ((opening == '(' && cur == ')') || (opening == '{' && cur == '}') || (opening == '[' && cur == ']')) {
                } else return false;
            }
        }

        return stack.isEmpty();
    }
}
