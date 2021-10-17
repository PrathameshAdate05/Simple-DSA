//Write a Program to Convert Binary Number to Decimal
//manually by creating user-defined functions.

package Functions;

import java.util.Scanner;

public class Q3 {

    static int toDecimal(int number){
        int result = 0;
        int n = 0;
        while (number > 0){
            result += (number % 2) * Math.pow(2,n);
            number /= 10;
            n++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary no :");
        int n = sc.nextInt();
        System.out.println(toDecimal(n));
    }
}
