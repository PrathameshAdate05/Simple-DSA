//          *
//         * *
//        *   *
//       *     *
//      * * * * *

package Pattern;

import Sound.Sample;

import java.util.Scanner;

public class Q7 {

    static void printHollowPyramid(int n){
        for(int i=1;i<=n;i++){

            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i-1);j++){
                if(i==n||j == 1 || j == 2* i-2)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int n = sc.nextInt();
        printHollowPyramid(n);
    }
}
