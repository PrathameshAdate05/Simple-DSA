//Write a Program that takes three integers from the user and
//swaps them in cyclic order using pointers.
//Example:
//Enter value of a, b and c respectively:1 2 3
//Value after swapping numbers in cycle:
//a=3
//b=1
//c=2

package MultiDimentionalArray;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A:");
        int a = sc.nextInt();
        System.out.println("Enter value of B:");
        int b = sc.nextInt();
        System.out.println("Enter value of C:");
        int c = sc.nextInt();

        swap(a,b,c);

    }

    private static void swap(int a, int b, int c) {
        int temp = 0;
        System.out.println("You Entered :");
        System.out.println("A: "+a+"\nB: "+b+"\nC: "+c);
        temp = b;
        b = a;
        a = c;
        c = temp;
        System.out.println("\nSwapped");
        System.out.println("A: "+a+"\nB: "+b+"\nC: "+c);

    }
}
