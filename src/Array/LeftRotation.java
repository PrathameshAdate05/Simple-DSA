package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeftRotation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        List<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        rotate(arr,arr.length,4);
        rotateList(list,10);
    }

    private static void rotateList(List<Integer> list, int rotation) {

//        int n = list.size();
//        List<Integer> rotate = new ArrayList<>(5);
//
//        for (int i=0;i<n;i++){
//            int j = (i+n-rotation)%n;
//            rotate.add(j,list.get(i));
//        }
        Collections.rotate(list,rotation);
        System.out.println(list);
    }

    private static void rotate(int[] arr, int length,int rotation) {

        int[] rotate = new int[arr.length];


        for (int i=0;i<length;i++){
            int j=(i+length-rotation)%length;
            rotate[j] = arr[i];
        }


        for (int i:rotate){
            System.out.print(i+" ");
        }
    }
}
