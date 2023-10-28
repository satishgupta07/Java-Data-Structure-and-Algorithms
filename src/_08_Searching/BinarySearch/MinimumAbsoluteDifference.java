package _08_Searching.BinarySearch;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int arr[] = {2,2,4,5,7,9,25,56,88,94};
        findMinimumAbsoluteDifference(arr,18);
    }

    private static void findMinimumAbsoluteDifference(int arr[], int target){

        if(arr.length == 0){
            return;
        }

        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if(arr[mid]<target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        // if element exists then ans will be zero
        int res = 0;

        // element does not exists
        if(ans == -1){
            if(end == -1){
                res = Math.abs(target - arr[start]);
            } else if(start == arr.length){
                res = Math.abs(target - arr[end]);
            }
            else {
                int ans1 = Math.abs(target - arr[start]);
                int ans2 =  Math.abs(target - arr[end]);
                res = (ans1<ans2)?ans1:ans2;
            }
        }
        System.out.println("Minimum Absolute difference is :"+ res);
    }
}
