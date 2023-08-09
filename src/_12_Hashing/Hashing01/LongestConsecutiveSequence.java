package _12_Hashing.Hashing01;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int A[] = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(A));
    }

    public static int longestConsecutive(final int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        HashSet<Integer> set=new HashSet();
        for(int i=0; i<A.length; i++) {
            set.add(A[i]);
        }
        int ans = 0;
        for(int i=0; i<A.length; i++) {
            if(!set.contains(A[i]-1)) {
                int chainlength = 1;
                int x = A[i]+1;
                while(set.contains(x)) {
                    chainlength++;
                    x++;
                }
                ans = Math.max(ans, chainlength);
            }
        }
        return ans;
    }


}
