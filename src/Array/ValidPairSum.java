package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidPairSum {

    public static void main(String[] args) {
        int[] arr = {3, -2, 1};

        System.out.println(findPairs(arr));
    }

    static int findPairs(int[] arr){
        int n=arr.length;
        int count=0;
        Arrays.sort(arr);
        int i=0,j=n-1;

        while (i<j){
            if(arr[i]+arr[j]>0){
                System.out.println(count);
                count+=(j-i);
                j--;
            }
            else {
                i++;
            }
        }
        return count;
    }

}
