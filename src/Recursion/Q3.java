//Write a Program that calculates the power of a number
//using recursion where base and exponent is entered by the
//user.

package Recursion;

import java.util.Scanner;

public class Q3 {

    static int pow = 1;
    static int findPow(int base,int expo){
        if(expo != 0){
            pow *= base;
            return findPow(base,expo-1);
        }
        else
            return pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base :");
        int base = sc.nextInt();
        System.out.println("Enter exponent :");
        int expo = sc.nextInt();
        System.out.println(findPow(base,expo));
    }
}
