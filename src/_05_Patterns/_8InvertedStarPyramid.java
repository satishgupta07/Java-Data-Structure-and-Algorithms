package _05_Patterns;

import java.util.Scanner;

//    * * * * * * * * *
//      * * * * * * *
//        * * * * *
//          * * *
//            *
public class _8InvertedStarPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int row = n; row >= 1 ; row--) {
            int space = 1;
            while(space <= n - row){
                System.out.print("  ");
                space = space + 1;
            }
            for (int col = 1; col <= (2*row - 1) ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
