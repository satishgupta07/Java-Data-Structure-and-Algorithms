package _12_Hashing.Hashing01;

import java.util.HashMap;

/**
 * Given an array of integers A, find and return whether the given array contains a non-empty
 * subarray with a sum equal to 0.
 * If the given array contains a sub-array with sum zero return 1, else return 0.
 */
public class SubArrayWith0Sum {
    public static void main(String[] args) {
        int A[] = {4, -1, 1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if(A[i]==0 || sum==0 || map.containsKey(sum)) {
                return 1;
            }

            map.put(sum, i);
        }

        return 0;
    }


}
