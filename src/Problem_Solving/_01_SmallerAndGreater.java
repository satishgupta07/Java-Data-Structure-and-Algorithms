package Problem_Solving;

// You are given an Array A of size N.
// Find for how many elements, there is a strictly smaller element and a strictly greater element.
public class _01_SmallerAndGreater {
    public static void main(String[] args) {
        int [] arr = {2,1,3};
        System.out.println(solve(arr));
    }
    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }

        int count = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i]>min && A[i]<max) {
                count++;
            }
        }

        return count;
    }
}
