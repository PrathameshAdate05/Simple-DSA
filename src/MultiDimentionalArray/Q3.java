//Write a Program that takes a matrix of order r*c from the user
//and computes the transpose of the matrix.

package MultiDimentionalArray;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter size of columns :");
        int col = sc.nextInt();

        int[][] matrix = new int[rows][col];
        System.out.println("Enter matrix elements :");
        for (int i=0;i<rows;i++){
            for (int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        transpose(matrix,rows,col);
    }

    private static void transpose(int[][] matrix, int rows, int col) {

        int[][] transpose = new int[col][rows];

        for (int j=0;j<col;j++) {
            for (int i=0;i<rows;i++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nEntered Matrix :");
        for (int i=0;i<rows;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose");
        for (int i=0;i<col;i++){
            for (int j=0;j<rows;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
