package _08_Searching.BinarySearch;

/*
    Given an array of integers nums sorted in non-decreasing order, find the starting and
    ending position of a given target value.
    If target is not found in the array, return [-1, -1].
    You must write an algorithm with O(log n) runtime complexity.
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
 */
public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int first = binarySearch(nums, 8, true);
        int last = binarySearch(nums, 8, false);

        System.out.println(first+" "+last);
    }

    private static int binarySearch(int[] arr, int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==target) {
                ans = mid;
                if(isFirst) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else if(arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
}
