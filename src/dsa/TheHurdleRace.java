package dsa;

import java.util.Arrays;

public class TheHurdleRace {

    public static void main(String[] args) {

        int[] arr = {1 ,6 ,3 ,5 ,2};
        int k = 4;

        System.out.println(race(arr,k));
        System.out.println((char) 122);
    }

    static int race(int[] arr,int k){

        int res=0;

        Arrays.sort(arr);
        res = arr[arr.length-1];


        return (res<k) ? 0 : res-k;
    }
}
