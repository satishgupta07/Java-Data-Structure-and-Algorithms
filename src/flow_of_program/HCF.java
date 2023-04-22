package flow_of_program;

/* Take 2 numbers as inputs and find their HCF */
public class HCF {
    public static void main(String[] args) {
        int num1 = 36, num2 = 60, hcf=0;

        /* Method 1 : Linear Quest */
//        for (int i = 1; i <= num1 || i <= num2; i++) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                hcf = i;
//            }
//        }
//        System.out.println("The HCF: "+ hcf);

        /* Method 2 : Repeated Subtraction */
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }
        System.out.println("The HCF: "+ num1);
    }
}
