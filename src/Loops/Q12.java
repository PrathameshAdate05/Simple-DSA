//Write a Program to Check Whether a Number N
//entered by user is Palindrome or Not

package Loops;

import java.util.Scanner;

public class Q12 {

    static int reverse(int number){
        int result = 0;

        while (number > 0){
            result = (result*10)+(number%10);
            number /= 10;
        }
        return result;
    }

    static String palindrome(int number){
        return (number == reverse(number) ? "Palindome" : "Not Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        System.out.println(palindrome(n));
    }
}
