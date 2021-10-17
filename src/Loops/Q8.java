//Write a Program to Reverse a given Number N by user

package Loops;

import  java.util.Scanner;

public class Q8 {

    //loop method
    static int reverse(int number){
        int remainder = 0;
        int result = 0;

        while (number != 0){
            remainder = number%10;
            result = result*10+remainder;
            number /= 10;

        }
        return result;
    }

    //string method
    static int stringReverse(int number){

        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));

        stringBuffer.reverse();
        return Integer.parseInt(String.valueOf(stringBuffer));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(stringReverse(n));
    }
}
