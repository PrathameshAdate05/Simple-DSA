package Pattern;

public class OuterDiamond {

    public static void main(String[] args) {

        int n=5;

        for (int i=n;i>=1;i--){

            //left *
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }

            //spaces
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }

            //right *
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //bottom

        for (int i=1;i<=n;i++){

            //left *
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }

            //spaces
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }

            //right *
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
