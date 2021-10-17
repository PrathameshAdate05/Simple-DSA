//Write a Program to Display Fibonacci Series upto nth
//term (n is entered by user)

package Loops;

import java.util.Scanner;

public class Q4 {

    static void printFibonacciSeries(int number){
        int before = 0;
        int after = 1;
        int sum;
        System.out.println(before+"\n"+after);
        for(int i=2;i<=number;i++){
            System.out.println(before+after);
            sum = before+after;
            before = after;
            after = sum;
        }
    }

    public static void main(String[] args) {
        printFibonacciSeries(10);
    }
}
