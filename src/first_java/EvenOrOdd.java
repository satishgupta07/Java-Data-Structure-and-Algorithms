package first_java;

import java.util.Scanner;

/* Write a program to print whether a number is even or odd,
    also take input from the user.  */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2==0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
