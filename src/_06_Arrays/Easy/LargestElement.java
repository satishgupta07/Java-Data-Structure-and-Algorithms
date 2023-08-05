package _06_Arrays.Easy;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] =  {8,10,5,7,9};

        int max = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
