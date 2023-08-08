package _11_Recursion.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};

        System.out.println(linsearch(ar, 7, 0));
    }

    private static int linsearch(int[] ar, int target, int index) {
        if(index == ar.length) {
            return -1;
        }

        if(ar[index] == target) {
            return index;
        }

        return linsearch(ar, target, index+1);
    }
}
