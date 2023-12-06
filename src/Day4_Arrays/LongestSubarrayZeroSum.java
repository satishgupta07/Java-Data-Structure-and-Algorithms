package Day4_Arrays;

import java.util.HashMap;

/*
  Prefix Sum
 */
public class LongestSubarrayZeroSum {
    public static void main(String[] args) {
        int[] nums = {4, 2, -3, 1, 6};
        int result = longestSubarrayWithZeroSum(nums);
        System.out.println("Length of the longest subarray with zero sum: " + result);
    }

    public static int longestSubarrayWithZeroSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum == 0) {
                maxLength = i + 1;
            }

            if (map.containsKey(currentSum)) {
                maxLength = Math.max(maxLength, i - map.get(currentSum));
            } else {
                map.put(currentSum, i);
            }
        }

        return maxLength;
    }
}
