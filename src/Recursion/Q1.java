//Write a Program to Find Sum of N Natural Numbers
//(entered by users) using Recursion

package Recursion;

import java.util.Scanner;

public class Q1 {
    static int sum = 0;
    static int findSum(int n){
        if(n != 0){
            sum += n;
            return findSum(n-1);
        }
        else
            return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int n = sc.nextInt();
        System.out.println(findSum(n));
    }
}
