package Day2_Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int m = 3;
        int[] arr2 = {2,5,6};
        int n = 3;
        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i= m+n-1;
        while(p2>=0) {
            if(p1>=0 && nums1[p1]> nums2[p2]) {
                nums1[i--] = nums1[p1--];
            }
            else {
                nums1[i--] = nums2[p2--];
            }
        }
    }
}
