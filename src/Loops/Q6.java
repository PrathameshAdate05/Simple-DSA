// Write a Program to Find GCD or HCF of two numbers
//entered by user

package Loops;

import java.util.Scanner;

public class Q6 {

    static int findGCD(int a, int b){
        if(b == 0)
            return a;
        return findGCD(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tow numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGCD(a,b));
    }
}
