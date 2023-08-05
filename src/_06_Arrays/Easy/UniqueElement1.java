package _06_Arrays.Easy;

public class UniqueElement1 {
    public static void main(String[] args) {
        int A[] = {1, 1, 2, 5, 5};
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans = ans^A[i];
        }

        System.out.println(ans);
    }
}
