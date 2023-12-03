package Day1_Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        solution1(5);
        System.out.println("/**************************************/");
        printPascal(5);
    }


    /*    Approach #1: nCr formula:
             n ! / ( n – r ) ! r !
    */
    public static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }

    public static void solution1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                // for left spacing
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                // nCr formula
                System.out.print(" "+ factorial(i) / (factorial(i - j) * factorial(j)));
            }
            System.out.println();
        }
    }

    /*
        Approach #2:   Binomial Coefficient
        C(line, i) = C(line, i-1) * (line - i + 1) / i
     */
    public static void printPascal(int n) {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                // for left spacing
                System.out.print(" ");
            }

            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}
