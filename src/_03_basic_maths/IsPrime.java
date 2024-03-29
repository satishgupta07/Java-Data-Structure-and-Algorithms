package _03_basic_maths;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) {
            System.out.println("No");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
