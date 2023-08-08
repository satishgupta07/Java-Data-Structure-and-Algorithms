package _11_Recursion.Easy;

/**
 *  Take as input N, the size of array. Take N more inputs and store that in an array.
 *  Write a recursive function which returns true if the array is sorted and false otherwise.
 *  Print the value returned.
 */
public class CheckSortedArray {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};
        System.out.println(check(ar, 0));
    }

    private static boolean check(int[] ar, int i) {
        if(i == ar.length-1) {
            return true;
        }

        if(ar[i] > ar[i+1]) {
            return false;
        }

        return check(ar, i+1);
    }
}
