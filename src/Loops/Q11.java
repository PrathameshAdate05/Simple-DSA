//Write a Program to Calculate Power of a Number
//without using inbuilt pow() function by taking two
//inputs from users as Base and exponent respectively

package Loops;

import java.util.Scanner;

public class Q11 {

    static void calPow(int base,int expo){
        double res = 1;
        while (expo > 0){
            res *= base;
            expo--;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base & exponent :");
        int base = sc.nextInt();
        int expo = sc.nextInt();
        calPow(base,expo);
    }
}
