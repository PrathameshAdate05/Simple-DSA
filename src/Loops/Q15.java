//Write a Program to check whether a number entered
//by the user is an Armstrong number or not.

package Loops;

import java.util.Scanner;
import java.lang.Math;

public class Q15 {

    static String checkArmstrong(int number){
        int sum = 0;
        int res = 0;
        int length = 0;

        while (number > 0){
            length++;
            number /= 10;
        }
        while (number > 0){
            res = number % 10;
            sum += (int) Math.pow(res,length);
            number /= 10;
        }
        return (sum == number) ? "Armstrong" : "Not Armstrong";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int n = sc.nextInt();
        System.out.println(checkArmstrong(n));
    }
}
