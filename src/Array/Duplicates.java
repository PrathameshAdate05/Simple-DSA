package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

    public static void main(String[] args) {
        int[] arr={2,3,1,2,3};

        System.out.println(findDuplicates(arr));
    }

    static ArrayList<Integer> findDuplicates(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr);
        int i=0;
        while (i<arr.length-1){
            if(arr[i] != arr[i+1]){

            }
            else {
                list.add(arr[i]);
            }
            i++;
        }
        if(list.isEmpty())
            list.add(-1);

        return list;
    }
}
