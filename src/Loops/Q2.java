//Write a Program to Find Factorial of a given number N
//(N is entered by user)

package Loops;

import java.util.Scanner;

public class Q2 {

    static long factorial(int number){
        long fact = 1;
        for(int i=1;i<=number;i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
