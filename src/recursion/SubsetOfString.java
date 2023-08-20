package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetOfString {

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(findSubstrings(str));
    }

    public static List<String> findSubstrings(String str) {
        ArrayList<String> subsets = new ArrayList<>();

        helper(str, subsets, 0, "");
        Collections.sort(subsets);
        subsets.remove(0);

        return subsets;
    }

    public static void helper(String s, List<String> ans, int i, String cur) {
        if (i == s.length()) {
            ans.add(cur);
            return;
        }

        helper(s, ans, i + 1, cur + s.charAt(i));
        helper(s, ans, i + 1, cur);
    }
}
