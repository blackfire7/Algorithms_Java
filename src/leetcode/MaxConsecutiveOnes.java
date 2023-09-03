package leetcode;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        short length = 0;
        short result = 0;
        for (int elem : nums) {
            if (elem == 0) {
                length = 0;
            } else {
                length++;
                result = (short)Math.max(length, result);
            }
        }
        return result;
    }
}

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * ----
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,1,1,1]
 *
 * Output: 3
 *
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 *
 * ----
 *
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */