//Write a Program to Calculate Power of a Number
//using inbuilt pow() function by taking two inputs from
//users as Base and exponent respectively

package Loops;

import java.util.Scanner;
import java.lang.Math;

public class Q10 {

    static void calPow(int base, int expo){
        System.out.println(Math.pow(base,expo));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base :");
        int base = scanner.nextInt();
        System.out.println("Enter exponent :");
        int expo = scanner.nextInt();
        calPow(base,expo);
    }
}
