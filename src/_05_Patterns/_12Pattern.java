package _05_Patterns;

import java.util.Scanner;

//    1       1
//    1 2   2 1
//    1 2 3 2 1
public class _12Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 1;
        while(row <= n) {
            int col =1;
            int sidemirror = 1;
            while(col<=2*n-1){
                if(sidemirror <= row) {
                    System.out.print(sidemirror+" ");
                }
                else {
                    System.out.print("  ");
                }
                if(col<n) {
                    sidemirror++;
                } else {
                    sidemirror--;
                }
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
