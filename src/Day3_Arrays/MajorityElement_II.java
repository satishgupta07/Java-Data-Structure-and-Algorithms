package Day3_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement_II {
    public static void main(String[] args) {
        int [] array = {11,33,33,11,33,11};
        System.out.println(Arrays.toString(new List[]{majorityElement(array)}));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        for(int i=0; i<nums.length; i++) {
            if(candidate1 == nums[i]) {
                count1++;
            } else if(candidate2 == nums[i]) {
                count2++;
            } else if(count1==0) {
                candidate1 = nums[i];
                count1 = 1;
            } else if(count2==0) {
                candidate2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if (count1 > nums.length / 3) {
            ans.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            ans.add(candidate2);
        }

        return ans;
    }
}
