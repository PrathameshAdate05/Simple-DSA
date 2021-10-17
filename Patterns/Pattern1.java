    //        *
    //       **
    //      ***
    //     ****
    //    *****
    //     ****
    //      ***
    //       **
    //        *   

import java.util.*;

public class Pattern1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of pattern :");
        int n=sc.nextInt();
        int i,j;

       for(i=0;i<=n;i++){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
           for(j=1;j<=i;j++){
               System.out.print("*");
           }

           System.out.println();
       }

       for(i=n-1;i>=1;i--){

            
            for(j=n-i;j>=1;j--){
                System.out.print(" ");
            }
           for(j=1;j<=i;j++){
                System.out.print("*");
            }

           System.out.println();
       }

    }
}