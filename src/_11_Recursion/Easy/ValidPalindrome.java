package _11_Recursion.Easy;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *  Input: s = "A man, a plan, a canal: Panama"
 *  Output: true
 *  Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(isPalindrome(str, 0));
    }

    private static boolean isPalindrome(String str, int index) {
        if(index >= str.length()/2) {
            return true;
        }

        if(str.charAt(index) != str.charAt(str.length()-index-1)) {
            return false;
        }

        return  isPalindrome(str, index+1);
    }
}
