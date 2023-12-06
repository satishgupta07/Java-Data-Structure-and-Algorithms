package Day4_Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        int longestStreak = 0;

        for(int i=0; i<nums.length; i++) {
            if(!set.contains(nums[i]-1)) {
                int currentNum = nums[i];
                int currentStreak = 1;
                while(set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

}
