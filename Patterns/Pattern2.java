import java.util.*;

public class Pattern2{
    public static void main(String args[]){
        int i,j,k=1;
        char a='a';
        final int n=10;

        // *
        // **
        // ***
        // ****
        // *****
        // ******
        // *******
        // ********
        // *********
        // **********

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 1
        // 12
        // 123
        // 1234
        // 12345
        // 123456
        // 1234567
        // 12345678
        // 123456789
        // 123456789n


        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
            k=1;
        }

        // a
        // ab
        // abc
        // abcd
        // abcde
        // abcdef
        // abcdefg
        // abcdefgh
        // abcdefghi
        // abcdefghij


        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
            a='a';
        }



        // *
        // **
        // ***
        // ****
        // *****
        // ******
        // *******
        // ********
        // *********
        // **********
        // *********
        // ********
        // *******
        // ******
        // *****
        // ****
        // ***
        // **
        // *

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
        for(i=1;i<=n-1;i++){
            for(j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }



        // 1
        // 12
        // 123
        // 1234
        // 12345
        // 123456
        // 1234567
        // 12345678
        // 123456789
        // 12345678910
        // 123456789
        // 12345678
        // 1234567
        // 123456
        // 12345
        // 1234
        // 123
        // 12
        // 1
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k);
                k++;

            }
            System.out.println();
            k=1;
        }

        for(i=1;i<=n;i++){
            for(j=n-1;j>=i;j--){
                 System.out.print(k);
                 k++;
            }
            System.out.println();
            k=1;
        }


        // a
        // ab
        // abc
        // abcd
        // abcde
        // abcdef
        // abcdefg
        // abcdefgh
        // abcdefghi
        // abcdefghij
        // abcdefghi
        // abcdefgh
        // abcdefg
        // abcdef
        // abcde
        // abcd
        // abc
        // ab
        // a
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(a);
                a++;

            }
            System.out.println();
            a='a';
        }

        for(i=1;i<=n;i++){
            for(j=n-1;j>=i;j--){
                 System.out.print(a);
                 a++;
            }
            System.out.println();
            a='a';
        }
    }
}