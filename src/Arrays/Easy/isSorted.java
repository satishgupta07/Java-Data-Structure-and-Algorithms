package Arrays.Easy;

public class isSorted {
    public static void main(String[] args) {
        int arr[] =  {8,10,5,7,9};
        int arr2[] = {2,3,6,7,9};

        System.out.println(checkSorted(arr));
        System.out.println(checkSorted(arr2));
    }

    private static boolean checkSorted(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
