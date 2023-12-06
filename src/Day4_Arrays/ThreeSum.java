package Day4_Arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> listOfLists = threeSum(arr);
        for (List<Integer> innerList : listOfLists) {
            for (Integer element : innerList) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line for the next inner list
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            //remove duplicates:
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            //moving 2 pointers:
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return ans;
    }

//    public static List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> st = new HashSet<>();
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            Set<Integer> hashset = new HashSet<>();
//            for (int j = i + 1; j < n; j++) {
//                //Calculate the 3rd element:
//                int third = -(nums[i] + nums[j]);
//
//                //Find the element in the set:
//                if (hashset.contains(third)) {
//                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
//                    temp.sort(null);
//                    st.add(temp);
//                }
//                hashset.add(nums[j]);
//            }
//        }
//
//        // store the set elements in the answer:
//        List<List<Integer>> ans = new ArrayList<>(st);
//        return ans;
//    }
}
