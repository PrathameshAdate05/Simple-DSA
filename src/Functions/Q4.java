//Write a Program to Convert Decimal to Binary number
//manually by creating user-defined functions.

package Functions;

import java.util.Scanner;

public class Q4 {

    static String toBinary(int number){
        return Integer.toBinaryString(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal no :");
        int n =  sc.nextInt();
        System.out.println(toBinary(n));
    }
}
