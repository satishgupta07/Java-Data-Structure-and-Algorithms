package _08_Searching.BinarySearch;

/*
    You are given an array of characters letters that is sorted in non-decreasing order,
    and a character target. There are at least two different characters in letters.
    Return the smallest character in letters that is lexicographically greater than target.
     If such a character does not exist, return the first character in letters.

     Input: letters = ["c","f","j"], target = "a"
     Output: "c"
 */

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'a'));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        char ans = '$';
        int start = 0;
        int end = letters.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(letters[mid]==target) {
                ans = letters[mid];
                break;
            } else if(letters[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
                ans = letters[mid];
            }
        }
        return (ans=='$') ? letters[0]:ans;
    }
}
