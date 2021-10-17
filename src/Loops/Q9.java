//Write a Program to display sum of all digits of a given
//Number N by user

package Loops;

import java.util.Scanner;

public class Q9 {

    static int sum = 0;
    static int sum(int number){
         sum = 0;
        while (number != 0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }

    static int recursiveSum(int number){
        if(number > 0){
            sum += number%10;
            recursiveSum(number/10);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println(recursiveSum(n));
    }
}
