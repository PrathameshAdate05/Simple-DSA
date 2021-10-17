//  * * * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *

package Pattern;

import java.util.Scanner;

public class Q6 {

    static void printInvertedPyramid(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int n = sc.nextInt();
        printInvertedPyramid(n);
    }
}
