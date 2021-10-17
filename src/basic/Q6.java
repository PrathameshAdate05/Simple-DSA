
//Write a Program to Swap Two Numbers

package basic;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,temp;

        System.out.println("Enter two no :");
        a = sc.nextInt();
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("a : "+a+"\n b :"+b);
    }
}
