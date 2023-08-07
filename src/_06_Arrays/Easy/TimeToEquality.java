package _06_Arrays.Easy;

/**
 * Given an integer array A of size N. In one second, you can increase the value of one element by 1.
 * Find the minimum time in seconds to make all elements of the array equal.
 */
public class TimeToEquality {
    public static void main(String[] args) {
        int A[] = {2, 4, 1, 3, 2};

        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int max_element = A[0];
        for(int i=1; i<A.length; i++) {
            if(max_element<A[i]) {
                max_element = A[i];
            }
        }

        int time = 0;
        for(int i=0; i<A.length; i++) {
            time += max_element - A[i];
        }

        return time;
    }
}
