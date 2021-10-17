//Write a Program to Calculate Factorial of a Number Using
//Recursion

package Recursion;

import java.util.Scanner;

public class Q2 {

    static int fact = 1;
    static int findFactorial(int n){
        if(n != 0){
            fact *= n;
            return findFactorial(n-1);
        }
        else
            return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int n = sc.nextInt();
        System.out.println(findFactorial(n));
    }
}
