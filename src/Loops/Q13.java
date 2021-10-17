//Write a Program to Check Whether a Number is Prime
//or Not

package Loops;

import java.util.Scanner;
import java.lang.Math;

public class Q13 {

    static String checkPrime(int number){

        boolean flag = true;

        if(number < 2)
            return "Not Prime";
        for (int i = 2;i<=Math.sqrt(number);i++){
            if(number%i == 0) {
                flag = false;
                break;
            }
        }
        if (flag)
            return "Prime";
        else
            return "Not Prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        System.out.println(checkPrime(n));
    }
}
