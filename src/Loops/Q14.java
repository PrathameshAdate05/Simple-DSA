//Write a Program to Display Prime Numbers Between
//Two Intervals (entered by user)

package Loops;

import java.util.Scanner;
import java.lang.Math;

public class Q14 {

    static void printPrime(int start,int end){
        boolean flag = true;
        int count = 0;

        for (int i = start;i<=end;i++){
            if(i>1) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i);
                    count++;
                }
                flag = true;
            }
        }
        System.out.println("No of Primes in this range :"+count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number :");
        int start = sc.nextInt();
        System.out.println("Enter end number :");
        int end = sc.nextInt();
        printPrime(start,end);
    }
}
