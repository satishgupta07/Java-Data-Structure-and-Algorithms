package Day4_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int [] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> listOfLists = fourSum(arr, target);
        for (List<Integer> innerList : listOfLists) {
            for (Integer element : innerList) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line for the next inner list
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j=i+1; j<nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum<target) {
                        k++;
                    } else if(sum>target) {
                        l--;
                    } else {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        while (k < l && nums[k] == nums[l + 1]) {
                            l--;
                        }
                    }
                }
            }
        }

        return ans;
    }
}
