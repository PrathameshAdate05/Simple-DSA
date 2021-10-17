package dsa;

import java.util.Arrays;
import java.util.Collections;

public class SalesByMatch {

    static void findPairs(int[] arr,int n){
        int pairs = 0;

        Arrays.sort(arr);

        for(int i=0;i<n-1;) {
            if(arr[i] == arr[i+1]) {
                pairs++;
                i += 2;
            }
            else
                i++;

        }
//        pairs += count/2;
        System.out.println(pairs);
    }

    public static void main(String[] args) {
        int[] arr = {6 ,5 ,2 ,3 ,5 ,2 ,2 ,1 ,1 ,5 ,1 ,3 ,3 ,3 ,5};
        int n = arr.length;
        findPairs(arr,n);
//        System.out.println(3/2);
    }
}
