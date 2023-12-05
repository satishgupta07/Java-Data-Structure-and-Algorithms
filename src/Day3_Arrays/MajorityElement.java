package Day3_Arrays;

/*
   Boyer Moore’s Voting Algorithm
 */
public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {4,4,2,4,3,4,4,3,2,4};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        int val = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++) {
            if(count==0) {
                val = nums[i];
                count = 1;
            } else if(val==nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return val;
    }
}
