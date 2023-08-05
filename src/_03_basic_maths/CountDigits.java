package _03_basic_maths;

import java.io.*;

public class CountDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}

class Solution{
    static int evenlyDivides(int N){
        // code here
        int temp = N;
        int count = 0;
        while(temp != 0) {
            int digit = temp%10;
            if(digit!=0 && N%digit==0) {
                count++;
            }
            temp = temp/10;
        }
        return count;
    }
}
