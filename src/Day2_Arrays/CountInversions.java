package Day2_Arrays;

public class CountInversions {
    public static void main(String[] args) {
        long[] a = {2, 5, 1, 3, 4};
        int n = 5;
        long cnt = getInversions(a, n);
        System.out.println("The number of inversions is: " + cnt);
    }

    public static long getInversions(long arr[], int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
