package _01_flow_of_program;

/* Input a year and find whether it is a leap year or not. */
public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
