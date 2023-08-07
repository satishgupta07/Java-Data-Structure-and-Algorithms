package _06_Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number
 * represented by the digits ).
 * The digits are stored such that the most significant digit is at the head of the list.
 * NOTE: Certain things are intentionally left unclear in this question which you should practice
 * asking the interviewer. For example: for this problem, the following are some good questions to ask :
 * Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
 * A: For the purpose of this question, YES
 * Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
 * A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 */
public class AddOneToNumber {
    public List<Integer> addOne(List<Integer> digits) {
        int n = digits.size();
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int total = digits.get(i) + carry;
            digits.set(i, total % 10);
            carry = total / 10;
        }

        if (carry > 0) {
            digits.add(0, carry);
        }

        // Remove any leading zeros
        while (digits.size() > 1 && digits.get(0) == 0) {
            digits.remove(0);
        }

        return digits;
    }

    public static void main(String[] args) {
        List<Integer> inputDigits = new ArrayList<>();
        inputDigits.add(9);
        inputDigits.add(9);
        inputDigits.add(9);

        AddOneToNumber solution = new AddOneToNumber();
        List<Integer> outputDigits = solution.addOne(inputDigits);

        System.out.println(outputDigits);  // Output: [1, 2, 4]
    }
}

