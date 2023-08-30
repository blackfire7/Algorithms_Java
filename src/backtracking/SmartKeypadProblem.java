package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartKeypadProblem {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;
        Map<Character, String> hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");

        backTrack(digits, 0, hashMap, new StringBuilder(), res);
        return res;
    }

    public static void backTrack(String digits, int i, Map<Character, String> hm, StringBuilder sb, List<String> res) {
        if (i == digits.length()) {
            res.add(sb.toString());
        } else {
            String curr = hm.get(digits.charAt(i));
            for (int k = 0; k < curr.length(); k++) {
                sb.append(curr.charAt(k));
                backTrack(digits, i + 1, hm, sb, res);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
