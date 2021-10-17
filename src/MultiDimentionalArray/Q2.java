//Write a Program takes two matrices of order r1*c1 and r2*c2
//respectively. Then, the program multiplies these two matrices (if
//possible) and displays it on the screen.

package MultiDimentionalArray;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first row :");
        int frow = sc.nextInt();
        System.out.println("Enter size of first column :");
        int fcol = sc.nextInt();

        int[][] first = new int[frow][fcol];
        System.out.println("Enter first matrix elements :");
        for (int i=0;i<frow;i++){
            for (int j=0;j<fcol;j++){
                first[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter size of second row :");
        int srow = sc.nextInt();
        System.out.println("Enter size of second column :");
        int scol = sc.nextInt();

        int[][] second = new int[srow][scol];
        System.out.println("Enter second matrix elements :");
        for (int i=0;i<srow;i++){
            for (int j=0;j<scol;j++){
                second[i][j] = sc.nextInt();
            }
        }

        numtiplyMatrix(first,frow,fcol,second,srow,scol);
    }

    private static void numtiplyMatrix(int[][] first, int frow, int fcol, int[][] second, int srow, int scol) {

        int[][] result = new int[frow][scol];
        int sum = 0;

        for (int i=0;i<frow;i++){
            for (int j=0;j<scol;j++){
                sum = 0;
                for (int k=0;k<srow;k++){
                    sum += first[i][k] * second[k][j];
                }
                result[i][j] = sum;
            }
        }

        for (int i=0;i<result.length;i++){
            for (int j=0;j<result.length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
