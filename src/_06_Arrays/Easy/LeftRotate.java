package _06_Arrays.Easy;

public class LeftRotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        leftRotate(arr, 2, arr.length);

        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
    public static void leftRotate(int arr[], int k,int n) {
        k = k%n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void reverse(int arr[], int start, int end) {
        while(start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
