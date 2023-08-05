package _06_Arrays.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

    private static int missingNumber(int[] a, int n) {
        int xor1 = 0, xor2 = 0;

        for(int i=0; i<n-1; i++) {
            xor2 = xor2^a[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1^n;

        return (xor1^xor2);
    }
}
