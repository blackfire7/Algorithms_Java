package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SubsequenceOfGivenArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1, 2, 3);
//        Collections.addAll(list, 1, 1, 1);
        Collections.addAll(list, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        System.out.println(AllSubsets(list));
    }

    public static ArrayList<ArrayList<Integer>> AllSubsets(ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        nums.sort(Comparator.naturalOrder());
        helperSequence(nums, ans, 0, new ArrayList<>());
        return ans;
    }

    public static void helperSequence(ArrayList<Integer> nums, ArrayList<ArrayList<Integer>> ans, int index, ArrayList<Integer> cur) {
        ArrayList<Integer> curCopy = new ArrayList<>(cur);
        if (!ans.contains(cur))
            ans.add(curCopy);

        for (int i = index; i < nums.size(); i++) {
            cur.add(nums.get(i));
            helperSequence(nums, ans, i + 1, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
