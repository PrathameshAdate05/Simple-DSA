package Array;

import java.util.Arrays;

public class MinMax {

    public static void main(String[] args) {

        int[] arr = {2,4,89,6,4,7};

        findMinMax(arr);
    }

    private static void findMinMax(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}
