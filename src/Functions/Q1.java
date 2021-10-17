//Write a Program to Display Prime Numbers Between Two
//Intervals (entered by the user) Using Functions

package Functions;

import Sound.Sample;

import java.util.Scanner;

public class Q1 {

    static void printPrime(int start,int end){
        boolean flag = true;
            for (int i=start;i<=end;i++){
                if(i>1){
                    for (int j=2;j<=Math.sqrt(i);j++){
                        if(i%j == 0){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println(i);
                    }
                    flag=true;
                }
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start :");
        int start = sc.nextInt();
        System.out.println("Enter end :");
        int end = sc.nextInt();
        printPrime(start,end);
    }
}
