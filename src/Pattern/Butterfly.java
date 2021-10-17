//*        *
//**      **
//***    ***
//****  ****
//**********
//**********
//****  ****
//***    ***
//**      **
//*        *

package Pattern;

public class Butterfly {

    public static void main(String[] args) {
        int n=5;

        //top
        for(int i=1;i<=n;i++){

            //upper left *
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //upper right
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //bottom
        for(int i=n;i>=1;i--){

            //lower left *
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //bottom right
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
