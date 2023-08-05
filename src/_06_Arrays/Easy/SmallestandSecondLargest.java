package _06_Arrays.Easy;

public class SmallestandSecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
            if(arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        System.out.println("Second Max = "+secondMax);
        System.out.println("Second Min = "+secondMin);
    }
}
