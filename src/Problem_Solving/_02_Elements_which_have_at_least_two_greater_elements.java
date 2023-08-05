package Problem_Solving;

import java.util.*;

// You are given an array of distinct integers A, you have to find and return all elements
// in array which have at-least two greater elements than themselves.
// NOTE: The result should have the order in which they are present in the original array.
public class _02_Elements_which_have_at_least_two_greater_elements {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[] { 11, 17, 100, 5 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(Integer num:numbers) {
            list.add(num);
        }
        System.out.println(solve(list));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0; i<A.size(); i++) {
            if(A.get(i) > first) {
                second = first;
                first = A.get(i);
            }
            else if(A.get(i) > second) {
                second = A.get(i);
            }
        }
        for(int i=0; i<A.size(); i++) {
            if(A.get(i) < second) {
                list.add(A.get(i));
            }
        }
        return list;
    }
}
