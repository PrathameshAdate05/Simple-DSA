import java.util.*;

public class DiamondPatern{
    public static void main(String args[]){
        int i,j,k,l,count=1;
        final int n=10;


        //First part
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print("*");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print(" ");
            }
            
            System.out.println();

        }

        //Second part
        for(i=n-1;i>=1;i--){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print(" ");
            }
            
            System.out.println();

        }

    //           *
    //          ***
    //         *****
    //        *******
    //       *********
    //      ***********
    //     *************
    //    ***************
    //   *****************
    //  *******************
    //   *****************
    //    ***************
    //     *************
    //      ***********
    //       *********
    //        *******
    //         *****
    //          ***
    //           *


         


        //First part

        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print("*");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print(" ");
            }
            for(l=i;l<=n;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Second part

        for(i=n-1;i>=1;i--){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print(" ");
            }
            for(l=n;l>=i;l--){
                System.out.print("*");
            }
             System.out.println();
        }


        // ********** **********
        // *********   *********
        // ********     ********
        // *******       *******
        // ******         ******
        // *****           *****
        // ****             ****
        // ***               ***
        // **                 **
        // *                   *
        // **                 **
        // ***               ***
        // ****             ****
        // *****           *****
        // ******         ******
        // *******       *******
        // ********     ********
        // *********   *********
        // ********** **********


    }
}