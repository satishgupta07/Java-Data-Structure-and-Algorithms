package Problem_Solving;

import java.util.Arrays;

//    Print a Pattern According to The Given Value of A.
//    Example: For A = 3 pattern looks like:
//    1 0 0
//    1 2 0
//    1 2 3
public class _04_Pattern_Printing_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solve(4)));
    }
    public static int[][] solve(int A) {
        int[][] arr = new int[A][A];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(j<=i) {
                    arr[i][j] = j+1;
                }
                else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}
