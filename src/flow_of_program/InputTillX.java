package flow_of_program;

import java.util.Scanner;

/* Keep taking numbers as inputs till the user enters ‘x’,
    after that print sum of all.   */
public class InputTillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while (true) {
            String input = sc.nextLine();
            if(input.equals("x")){
                break;
            }

            int number = Integer.parseInt(input);
            sum+=number;
        }

        System.out.println("Sum of numbers: "+ sum);
    }
}
