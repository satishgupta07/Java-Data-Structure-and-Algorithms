package Patterns;

//    1
//    0 1
//    0 1 0
//    1 0 1 0
//    1 0 1 0 1
public class _11Pattern {
    public static void main(String[] args) {
        int n = 5;
        var flag = 1;
        for(int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++ ) {
                System.out.print(flag+" ");
                flag = (flag == 1 ? 0 : 1);
            }
            System.out.println();
        }
    }
}
