package _05_Patterns;

//    1 2 3 4 5
//    1 2 3 4
//    1 2 3
//    1 2
//    1
public class _6Pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            int index = 1;
            for (int j=i; j<=n; j++ ) {
                System.out.print(index+" ");
                index++;
            }
            System.out.println();
        }
    }
}
