//         **********
//        *        *
//       *        *
//      *        *
//     *        *
//    *        *
//   *        *
//  *        *
// *        *
//**********

package Pattern;

public class HollowRhombus {

    public static void main(String[] args) {
        int n=10;

        for (int i=1;i<=10;i++){

            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j=1;j<=n;j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
