package _06_Arrays.Easy;

import java.util.Arrays;

/**
 * Given a positive integer A, return an array of strings with all the integers from 1 to N.
 * But for multiples of 3 the array should have “Fizz” instead of the number. For the multiples
 * of 5, the array should have “Buzz” instead of the number. For numbers which are multiple of
 * 3 and 5 both, the array should have "FizzBuzz" instead of the number.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(15)));
    }
    public static String[] fizzBuzz(int A) {
        String[] arr = new String[A];
        for(int i=0; i<A; i++) {
            if((i+1)%15 == 0) {
                arr[i] = "FizzBuzz";
                continue;
            }
            else if((i+1)%3 == 0) {
                arr[i] = "Fizz";
                continue;
            }
            else if((i+1)%5 == 0) {
                arr[i] = "Buzz";
                continue;
            }
            else {
                arr[i] = ""+(i+1);
            }
        }
        return arr;
    }
}
