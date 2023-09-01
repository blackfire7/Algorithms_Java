package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String str = "aab";
        System.out.println(partition(str));
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> outer = new ArrayList<>();
        List<String> inner = new ArrayList<>();
        check(s, outer, inner);
        return outer;
    }

    public static void check(String s, List<List<String>> outer, List<String> inner) {
        if (s.length() == 0) {
            outer.add(new ArrayList<>(inner));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String s1 = s.substring(0, i);
            if (palindrome(s1)) {
                inner.add(s1);
                check(s.substring(i, s.length()), outer, inner);
                inner.remove(inner.size() - 1);
            }
        }
    }

    public static boolean palindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (j >= i) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
