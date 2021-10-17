//Write a Program to Display Fibonacci Series upto
//certain number n (n is entered by user)
//Example: n=100
//Output:
//Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,

package Loops;

import java.util.Scanner;

public class Q5 {

    static void printFibonacciSeries(int number){
        int before = 0,after = 1,sum = 0;

        while (sum < number){
            System.out.println(sum);
            before = after;
            after = sum;
            sum = before + after;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        printFibonacciSeries(n);
    }
}
