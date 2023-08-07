package _06_Arrays.Easy;

/**
 * Given an array of integers A of size, N. Find the longest subsequence of A, which is odd-even.
 * A subsequence is said to be odd-even in the following cases:
 * The first element of the subsequence is odd; the second element is even, the third element
 *  is odd, and so on. For example: [5, 10, 5, 2, 1, 4], [1, 2, 3, 4, 5]
 * The first element of the subsequence is even, the second element is odd, the third element
 *  is even, and so on. For example: [10, 5, 2, 1, 4, 7], [10, 1, 2, 3, 4]
 * Return the maximum possible length of odd-even subsequence.
 */
public class OddEvenSubsequences {
    public static void main(String[] args) {
        int A[] = {1, 2, 2, 5, 6};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int ans1 = 0,ans2 = 0;
        int x = 1,y = 0;
        for(int i=0; i<A.length; i++){
            if((A[i] & 1) == x){
                ++ans1;
                x ^= 1;
            }
            if((A[i] & 1) == y){
                y ^= 1;
                ++ans2;
            }
        }
        return Math.max(ans1,ans2);
    }
}
