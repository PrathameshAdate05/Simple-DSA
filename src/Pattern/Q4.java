//* * * * * *
//* * * * *
//* * * *
//* * *
//* *
//*

package Pattern;

import java.util.Scanner;

public class Q4 {

    static void printInvertedPyramid(int n){
        for (int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count :");
        int n = sc.nextInt();
        printInvertedPyramid(n);
    }
}
