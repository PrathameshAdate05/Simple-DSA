// 1 1 1 1 1
//  2 2 2 2
//   3 3 3
//    4 4
//     5

package Pattern;

public class InvertedHalfPyramid {

    public static void main(String[] args) {

        int n=5;

        for (int i=1;i<=n;i++){

            //spaces
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=n;j>i-1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
