package dsa;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

    static int count(int n, int k, List<Integer> arr){
        int count = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if((arr.get(i)+arr.get(j))%k == 0)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int n =6;
        int k = 3;
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(2);
        System.out.println(count(n,k,arr));
    }
}
