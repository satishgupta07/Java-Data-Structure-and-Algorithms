package _02_first_java;

import java.util.Scanner;

/* To find out whether the given String is Palindrome or not. */
public class CheckPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int end = str.length()-1;
        int start = 0;
        while(start <= end) {
            if(str.charAt(start) != str.charAt(end)) {
                System.out.println("Not a pallindrome");
                return;
            }
            start++;
            end--;
        }

        System.out.println("Pallindrome");
    }
}
