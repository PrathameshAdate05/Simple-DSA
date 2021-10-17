//Write a Program to Calculate Sum of first N Natural
//Numbers (here value of N is Entered by user)

package Loops;

import java.util.Scanner;
import java.time.Instant;
public class Q1 {

    static int calculateSum(int n){
        int sum = 0;
//        for(int i=1;i<=n;i++){
//            sum += i;
//
//        }
        sum = n * (n + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth natural no :");
        int n = sc.nextInt();

        System.out.println(calculateSum(n));

    }
}
