package _06_Arrays.Easy;

import java.util.Scanner;

/**
 * Given an integer array A of size N and an integer B, you have to print the same
 * array after rotating it B times towards the right.
 */
public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int B = sc.nextInt();

        rotate(arr, B);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        int temp = 0;
        while(start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int B) {
        B = B%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,B-1);
        reverse(arr,B,arr.length-1);
    }
}
