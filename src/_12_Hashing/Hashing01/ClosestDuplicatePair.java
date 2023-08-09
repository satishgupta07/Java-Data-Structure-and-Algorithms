package _12_Hashing.Hashing01;

import java.util.HashMap;

/**
 * Shaggy has an array A consisting of N elements. We call a pair of distinct indices
 * in that array a special if elements at those indices in the array are equal.
 * Shaggy wants you to find a special pair such that the distance between that pair is minimum.
 * Distance between two indices is defined as |i-j|. If there is no special pair in the array, then return -1.
 */
public class ClosestDuplicatePair {
    public static void main(String[] args) {
        int A[] = {7, 1, 3, 4, 1, 7};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++) {
            if(map.containsKey(A[i])) {
                ans = Math.min(ans, i - map.get(A[i]));
            }
            map.put(A[i], i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
