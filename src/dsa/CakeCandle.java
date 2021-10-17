package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CakeCandle{

    static int countHighestCandle(int n,int[] arr){
        int count = 0;
//        int max = arr[0];
//        for (int i=0;i<n;i++){
//            if(arr[i] > max)
//                max = arr[i];
//        }
        Arrays.sort(arr);
        int max = arr[arr.length-1];
//        System.out.println(max);
        for (int i=0;i<n;i++){
            if(arr[i] == max)
                count++;
        }
        return count;

    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {4,4,3,1};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(0);
        list.add(9);

        Collections.sort(list);
        System.out.println(list);

//        System.out.println(countHighestCandle(n,arr));

    }
}
