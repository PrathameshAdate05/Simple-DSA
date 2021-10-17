//        *
//
//      * * *
//
//    *   *   *
//
//  *     *     *
//
//* * * * * * * * *
//
//  *     *     *
//
//    *   *   *
//
//      * * *
//
//        *

package Pattern;

public class Kite {

    public static void main(String[] args) {

        int n=9;

        // upper part
        for (int i=1;i<=n;i++){

            // spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // *'s
            for (int j=1;j<=i;j++){
               if(i%2!=0){
                   if(i-j==j-1 || j==1 || i==n || i==j){
                       System.out.print("* ");
                   }
                   else {
                       System.out.print("  ");
                   }
               }
            }
            System.out.println();

        }
        //bottom part

        for (int i=n-1;i>=1;i--){

            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // *'s
            for (int j=1;j<=i;j++){
                if(i%2!=0){
                    if(j==1 || i==j || i-j==j-1){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
}
