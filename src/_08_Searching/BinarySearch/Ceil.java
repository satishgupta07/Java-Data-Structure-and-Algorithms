package _08_Searching.BinarySearch;

/*
    Given a sorted array and a value x, the floor of x is the largest element
     in the array smaller than or equal to x
     Input: arr[] = {1, 2, 8, 10, 10, 12, 19}, x = 5
     Output: 2
 */

public class Ceil {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        System.out.println(binarySearchCeil(arr, 5));
    }

    private static int binarySearchCeil(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==target) {
                ans = arr[mid];
                break;
            } else if(arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
                ans = arr[mid];
            }
        }
        return ans;
    }

}
