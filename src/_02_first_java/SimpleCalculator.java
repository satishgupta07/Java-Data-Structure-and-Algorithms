package _02_first_java;

import java.util.Scanner;

/* Take in two numbers and an operator (+, -, *, /) and
    calculate the value. (Use if conditions) */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Choose Operator (+, -, *, /) : ");
        char op=sc.next().charAt(0);

        if(op == '+') {
            System.out.println("Result = "+ (num1+num2));
        } else if(op == '-') {
            System.out.println("Result = "+ (num1-num2));
        } else if(op == '*') {
            System.out.println("Result = "+ (num1*num2));
        } else if(op == '/') {
            System.out.println("Result = "+ (num1/num2));
        } else {
            System.out.println("INVALID OPERATOR !");
        }

    }
}
