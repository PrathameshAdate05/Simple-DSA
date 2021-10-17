//Write a Program to Find LCM of two numbers entered
//by user

package Loops;

import java.util.Scanner;

public class Q7 {

    static int findGCD(int a,int b){

        if(b == 0)
            return a;
        return findGCD(b,a%b);
    }

    static int findLCM(int a,int b){
        return (a * b)/findGCD(a,b);
    }

    public static void main(String[] args) {
        System.out.println(findLCM(200,100));
    }
}
