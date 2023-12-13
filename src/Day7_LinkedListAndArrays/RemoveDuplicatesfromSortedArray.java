package Day7_LinkedListAndArrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
        for(int i=0; i<ans; i++) {
            System.out.print(nums[i]+ ", ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int i=1;
        for (int j=1; j<nums.length; j++){
            if(nums[j]>nums[i-1]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
