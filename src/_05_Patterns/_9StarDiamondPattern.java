package _05_Patterns;

import java.util.Scanner;

//            *
//          * * *
//        * * * * *
//      * * * * * * *
//        * * * * *
//          * * *
//            *
public class _9StarDiamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int k = 1;
        int row = 1;
        while(k <= 2*n-1) {
            int space = 1;
            while(space <= n - row){
                System.out.print("  ");
                space = space + 1;
            }
            for (int col = 1; col <= (2*row - 1) ; col++) {
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
