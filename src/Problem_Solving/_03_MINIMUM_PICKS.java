package Problem_Solving;

//You are given an array of integers A of size N.
//Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
public class _03_MINIMUM_PICKS {
    public static void main(String[] args) {
        int A[] = {5, 17, 100, 1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;

        for(int i = 0; i < A.length; i++) {
            if( A[i] % 2 == 0 && A[i] > maxEven) {
                maxEven = A[i];
            } else if(A[i] % 2 != 0 && A[i] < minOdd) {
                minOdd = A[i];
            }
        }

        return maxEven - minOdd;
    }
}
