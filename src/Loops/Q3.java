//Write a Program to Generate Multiplication Table of a
//        number (entered by the user) using a for loop.


package Loops;

import  java.util.Scanner;

public class Q3 {

    static void printTable(int number){
        for(int i = 1; i <= number; i++){
            System.out.println(number+" x " +i+" = "+number*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        printTable(n);
    }
}
