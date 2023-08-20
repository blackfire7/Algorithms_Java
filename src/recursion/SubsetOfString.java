package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetOfString {

    public static List<String> subsets = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(findSubstrings("abc"));
    }

    public static List<String> findSubstrings(String s) {
        return printAllSubsets(s, 0, "");
    }


    public static List<String> printAllSubsets(String s, int i, String cur) {

        if (i == s.length()) {
            if (!cur.equals("")) subsets.add(cur);
            System.out.println(cur);
            return subsets;
        }

        printAllSubsets(s, i + 1, cur + s.charAt(i));
        printAllSubsets(s, i + 1, cur);

        Collections.sort(subsets);

        return subsets;
    }
}
