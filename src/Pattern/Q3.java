//*
//* *
//* * *
//* * * *
//* * * * *

package Pattern;

import java.util.Scanner;

public class Q3 {

    static void printPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows count :");
        int n = sc.nextInt();
        printPyramid(n);
    }
}
