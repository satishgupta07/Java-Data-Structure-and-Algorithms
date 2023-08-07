package _06_Arrays.Easy;

/**
 * Given an array A and an integer B. A pair(i, j) in the array is a good pair
 * if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 */
public class GoodPair {
    public static void main(String[] args) {
        int A[] = {1,2,3,4};
        int B = 7;

        System.out.println(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        int N = A.length;
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(A[i]+A[j] == B) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
