
//Write a program where the user is asked to enter two
//        integers (divisor and dividend) and the quotient and the
//        remainder of their division is computed.(Both divisor and
//        dividend should be integers.

package basic;

import  java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int divisor, dividend,quotient,remainder;

        System.out.println("Enter Dividend :");
        dividend = sc.nextInt();
        System.out.println("Enter Divisor");
        divisor = sc.nextInt();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient :"+quotient+"\nRemainder :"+remainder);
    }
}
