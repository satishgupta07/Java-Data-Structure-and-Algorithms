package Day2_Arrays;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        while(true){
            fast = nums[nums[fast]];
            slow = nums[slow];

            if(slow == fast)break;
        }
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
