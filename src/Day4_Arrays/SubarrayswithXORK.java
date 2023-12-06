package Day4_Arrays;

import java.util.HashMap;

public class SubarrayswithXORK {
    public static void main(String[] args) {
        int [] A = {4, 2, 2, 6, 4} ;
        int k = 6;
        System.out.println(subarraysWithSumK(A, k));
    }

    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int n = a.length;
        int xr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(xr, 1);
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            xr = xr ^ a[i];
            int x = xr ^ b;

            if (map.containsKey(x)) {
                count += map.get(x);
            }
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }

        return count;
    }
}
