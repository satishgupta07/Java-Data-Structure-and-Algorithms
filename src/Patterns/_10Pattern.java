package Patterns;

import java.util.Scanner;

//    *
//    * *
//    * * *
//    * * * *
//    * * *
//    * *
//    *
public class _10Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int k = 1;
        int row = 1;
        while(k <= 2*n-1) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            if(k<n) {
                row++;
            } else {
                row--;
            }
            k++;
            System.out.println();
        }
    }
}
