//Write a Program that calculates the standard deviation of 10
//data using arrays

package Array;

public class Q3 {

    static double calSD(int[] arr,int n){
        double sum = 0,mean = 0,SD = 0;

        for (int i=0;i<n;i++){
            sum += arr[i];
        }

        mean = sum/n;

        for (int i=0;i<n;i++){
            SD += Math.pow((arr[i] - mean),2);
        }

        return Math.sqrt(SD/n);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(calSD(arr,arr.length));
    }
}
