//Write a Program that takes N elements (max. value of N is 100
//and N is the float number specified by user) from user, stores data
//in an array and Calculates the average of those numbers.

package Array;

import java.util.Scanner;

public class Q1 {

    static float avg(float[] arr,int n){
        float sum = 0;
        for (int i=0;i<n;i++){
            sum += arr[i];
        }
        return sum/n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of data :");
        int n = sc.nextInt();
        float[] arr = new float[n];
        System.out.println("Enter array elements :");
        for (int i = 0; i< n; i++){
            System.out.println("Enter "+i+". element :");
            arr[i] = sc.nextFloat();
        }

        System.out.println("Average :"+avg(arr,n));
    }
}
