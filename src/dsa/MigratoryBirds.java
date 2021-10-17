package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds {

    static void birds(List<Integer> arr,int n){
        Collections.sort(arr);
        List<Integer> count = new ArrayList<>();
        int max = 0;
        int max2 = 0;
        int pos = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr.get(i) == arr.get(j)) {
                    max++;
                }
            }
            count.add(max);
            System.out.println(max);
            max = 0;
        }
        Collections.sort(count);
        System.out.println(count.get(n-1));
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        birds(arr,6);
    }
}
