package Day7_LinkedListAndArrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i]==1) {
                count++;
            }

            if(count > max) {
                max = count;
            }

            if(nums[i]==0) {
                count = 0;
            }
        }

        return max;
    }
}
