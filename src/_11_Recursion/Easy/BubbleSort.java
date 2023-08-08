package _11_Recursion.Easy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {5, 6, 3, 4, 2, 1};

        bubblesort(ar, ar.length - 1, 0);
        System.out.println(Arrays.toString(ar));
    }

    private static void bubblesort(int[] ar, int row, int col) {
        if(row == 0) {
            return;
        }

        if(row == col) {
            bubblesort(ar, row-1, 0);
            return;
        }

        if(ar[col] > ar[col + 1]) {
            swap(ar, col, col+1);
        }

        bubblesort(ar, row, col + 1);
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
