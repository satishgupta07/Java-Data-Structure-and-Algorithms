package Day3_Arrays;

public class Pow {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;

        System.out.println(myPow(x,n));
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double temp = myPow(x, n/2);

        if(n%2==0) {
            return temp*temp;
        } else {
            if(n>0) {
                return temp*temp*x;
            } else {
                return (temp*temp)/x;
            }
        }
    }
}
