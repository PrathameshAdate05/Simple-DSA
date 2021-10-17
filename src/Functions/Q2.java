//Write a Program to check if an integer (entered by the user)
//can be expressed as the sum of two prime numbers,if yes then
//print all possible combinations with the use of functions.
//Example
//Enter a positive integer: 34
//OUTPUT:
//34 = 3 + 31
//34 = 5 + 29
//34 = 11 + 23
//34 = 17 + 17

package Functions;

import java.util.Scanner;

public class Q2 {

    static void printCombination(int n){
        for (int i=1;i<=n/2;i++){

                if(isPrime(i) && isPrime(n-i)){
                    System.out.println(n+" = "+i+" + "+(n-i));
                }

        }

    }

    static boolean isPrime(int number){

        boolean flag = true;

        if(number < 2)
            return false;
        for (int i = 2;i<=Math.sqrt(number);i++){
            if(number%i == 0) {
                flag = false;
                break;
            }
        }
        return (flag) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int n = sc.nextInt();
        printCombination(n);
    }
}
