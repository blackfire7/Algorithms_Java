package backtracking;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PermutationOfString {

    public static void main(String[] args) {
        String str = "ABC";
        List<String> result = permute(str);
        result = result.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }


    public static List<String> permute(String str) {
        int n = str.length();
        List<String> strList = new ArrayList<>();
        permuteHelper(str, strList, 0, n - 1);
        Set<String> set = new LinkedHashSet<>(strList);
        strList.clear();
        strList.addAll(set);

        return strList;
    }

    public static void permuteHelper(String str, List<String> strList, int l, int r) {
        if (l == r) strList.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permuteHelper(str, strList, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
