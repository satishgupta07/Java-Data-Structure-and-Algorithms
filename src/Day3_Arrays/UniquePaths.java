package Day3_Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths1(3,7));
        System.out.println(uniquePaths2(3,7));
        System.out.println(uniquePaths(3,7));
    }

    public static int uniquePaths(int m, int n) {
        int N = m+n-2;
        int r = m-1;
        double res = 1;

        for(int i=1; i<=r; i++) {
            res = res*(N-r+i)/i;
        }

        return (int)res;
    }

    public static int uniquePaths1(int m, int n) {
        return helper1(0,0,m,n);
    }

    public static int helper1(int i, int j, int m, int n) {
        if(i==m-1 && j==n-1) {
            return 1;
        }
        if(i>=m || j>=n) {
            return 0;
        }

        return helper1(i+1,j,m,n) + helper1(i,j+1,m,n);
    }

    public static int uniquePaths2(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        return helper2(0,0,m,n,dp);
    }

    public static int helper2(int i, int j, int m, int n, int[][] dp) {
        if(i==m-1 && j==n-1) {
            return 1;
        }
        if(i>=m || j>=n) {
            return 0;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        return dp[i][j] = helper2(i + 1, j, m, n, dp) + helper2(i, j + 1, m, n, dp);
    }


}
