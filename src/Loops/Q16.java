//Write a Program to Display all Factors of a Number
//entered by User

package Loops;

import java.util.Scanner;

public class Q16 {

    static void findFactors(int number){
        for (int i = 1;i<=number;i++){
            if(number%i == 0)
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        findFactors(n);
    }
}
