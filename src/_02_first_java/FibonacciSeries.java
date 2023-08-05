package _02_first_java;

import java.util.Scanner;

/* To calculate Fibonacci Series up to n numbers.  */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0, second = 1;
        while(n>=0) {
            int temp = first + second;
            System.out.print(first+", ");
            first = second;
            second = temp;
            n = n-1;
        }
    }
}
