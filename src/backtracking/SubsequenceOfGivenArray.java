package backtracking;

import java.util.*;

public class SubsequenceOfGivenArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1, 2, 3);
//        Collections.addAll(list, 1, 1, 1);
        Collections.addAll(list, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        System.out.println(AllSubsets(list));
    }

    public static ArrayList<ArrayList<Integer>> AllSubsets(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helperSequence(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void helperSequence(ArrayList<Integer> nums, int index, ArrayList<Integer> cur, ArrayList<ArrayList<Integer>> Ans) {
        ArrayList<Integer> copyNums = new ArrayList<>(cur);
        Ans.add(copyNums);

        for (int i = index; i < nums.size(); i++) {
            if (i > index && nums.get(i)==nums.get(i-1)) continue;
            cur.add(nums.get(i));
            helperSequence(nums, i+1, cur, Ans);
            cur.remove(cur.size()-1);
        }
    }
}
