//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *

package Pattern;

import java.util.Scanner;

public class Q5 {

    static void printPyramid(int n){
        for (int i=0;i<n;i++){
            for(int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print(i-1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int n = sc.nextInt();
        printPyramid(n);
    }
}
