package Day4_Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                ans[1] = i;
                ans[0] = map.get(target-nums[i]);
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
