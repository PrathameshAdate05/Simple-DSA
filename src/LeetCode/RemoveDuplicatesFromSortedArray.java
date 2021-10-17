package LeetCode;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromSortedArray {

    static void removeDuplicates(int[] arr){
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hset.add(arr[i]);
        }

        System.out.println(hset);
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
    }
}
