//Write a Program that adds two matrices using Multidimensional Arrays where the number of rows r and columns c is
//entered by user (Value of r and c < 100)

package MultiDimentionalArray;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows :");
        int r = sc.nextInt();
        System.out.println("Enter size of columns :");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
