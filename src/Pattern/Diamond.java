//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//    * * * * * *
//   * * * * * * *
//  * * * * * * * *
// * * * * * * * * *
//* * * * * * * * * *
// * * * * * * * * *
//  * * * * * * * *
//   * * * * * * *
//    * * * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *

package Pattern;

public class Diamond {
    public static void main(String[] args) {
        int n=10;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=n-1;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=n-1;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
