package _08_Searching.BinarySearch;

public class Search_In_Infinite_Array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        findElementInInfiniteSortedArray(arr, 10);

        System.out.println("/****************************************************/");

        int arr1[] = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        findFirstOneInInfiniteSortedArray(arr1);
    }

    private static void findFirstOneInInfiniteSortedArray(int[] arr) {
        int range[] = findRangeInInfiniteArray(arr, 1);
        int ans = binarySearchInRange(arr, 1, range[0], range[1]);
        if(ans == -1) {
            System.out.println("Element does not exist");
        } else {
            System.out.println("Found element "+1+" at index : "+ans);
        }
    }

    private static void findElementInInfiniteSortedArray(int[] arr, int target) {
        int range[] = findRangeInInfiniteArray(arr, target);
        int ans = binarySearchInRange(arr, target, range[0], range[1]);
        if(ans == -1) {
            System.out.println("Element does not exist");
        } else {
            System.out.println("Found element "+target+" at index : "+ans);
        }
    }

    private static int binarySearchInRange(int[] arr, int target, int start, int end) {
        int ans = -1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==target) {
                ans = mid;
                break;
            } else if(arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }

    private static int[] findRangeInInfiniteArray(int[] arr, int target) {
        int range[] = new int[2];

        int start = 0;
        int end = 1;

        while (arr[end] < target) {
            start = end;
            end = 2*end;
        }
        range[0] = start;
        range[1] = end;

        return range;
    }
}
