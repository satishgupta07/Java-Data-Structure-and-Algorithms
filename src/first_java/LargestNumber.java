package first_java;

import java.util.Scanner;

/* Take 2 numbers as input and print the largest number.  */
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int largestNum = num1 > num2 ? num1 : num2;
        System.out.println("Largest Number is " + largestNum);
    }
}
