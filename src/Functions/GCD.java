package Functions;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter teo no :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(findGCD(a,b));
    }

    private static int findGCD(int a, int b) {

        int gcd = 0;
        for (int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}
