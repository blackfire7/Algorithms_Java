package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {8, 1, 3, 7, 2, 1, 5};
        int target = 12;
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
        findAns(0, target, candidates, ans, helper);
        return ans;
    }

    public static void findAns(int index, int target, int[] arr, List<List<Integer>> ans, List<Integer> helper) {
        if (target == 0) {
            ans.add(new ArrayList<>(helper));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > target) {
                break;
            }
            helper.add(arr[i]);
            findAns(i + 1, target - arr[i], arr, ans, helper);
            helper.remove(helper.size() - 1);
        }
    }
}
