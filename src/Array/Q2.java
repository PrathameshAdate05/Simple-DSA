//Write a Program that takes n element from user and displays
//the largest element of an array

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    static void findLargestAndSmall(int[] array,int n){
        int temp;

            for (int i=0;i<n;i++){
                for (int j=0;j<i;j++){
                    if(array[j] > array[j+1]){
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
//        Arrays.sort(array);
        System.out.println(array[n-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

        findLargestAndSmall(array,n);
    }
}
