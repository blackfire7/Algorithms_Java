package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] a = {-2, 0, 1, 2, 1};
        System.out.println(threeSum(a));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            List<List<Integer>> temp = threeSumHelper(nums, -nums[i], i+1);

            for (List<Integer> list: temp) {
                list.add(0, nums[i]);
                triplets.add(list);
            }
        }

        return triplets;
    }

    public static List<List<Integer>> threeSumHelper(int[] a, int sum, int startFrom) {

        int l = startFrom;
        int r = a.length - 1;

        List<List<Integer>> ans = new ArrayList<>();

        while (l < r) {
            if (a[l] + a[r] > sum) {
                r--;
            } else if (a[l] + a[r] < sum) {
                l++;
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(a[l]);
                temp.add(a[r]);
                ans.add(temp);
                l++; r--;
            }
        }

        return ans;

    }
}
